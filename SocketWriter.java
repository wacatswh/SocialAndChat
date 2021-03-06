/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatclient;

import javax.swing.SwingWorker;
import java.util.*;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.concurrent.locks.*;

/**
 *
 * @author seoww
 */
public class SocketWriter extends SwingWorker<Void, Void> {

    private List<String> messages;
    private ReentrantLock lock;
    private Condition waitCon;

    public SocketWriter() {
        messages = Collections.synchronizedList(new ArrayList<String>(25));
        lock = new ReentrantLock();
        waitCon = lock.newCondition();
    }

    public void write(String text) {
        System.out.println("Write " + text);
        messages.add(text);
        try {
            lock.lock();
            waitCon.signalAll();
        } finally {
            lock.unlock();
        }
    }

    @Override
    protected Void doInBackground() throws Exception {
        try (DataOutputStream out = new DataOutputStream(SocketManager.INSTACNE.getOutputStream())) {
            while (!isCancelled()) {
                while (messages.isEmpty() && !isCancelled()) {
                    try {
                        lock.lock();
                        waitCon.await();
                    } finally {
                        lock.unlock();
                    }
                }
                List<String> cache = new ArrayList<>(messages);
                messages.clear();
                for (String text : cache) {
                    System.out.println("Send " + text);
                    out.writeUTF(text);
                }
            }
        }
        return null;
    }

}
