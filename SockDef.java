/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatclient;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author seoww
 */
public class SockDef {
    public static Socket socialSock;
    static ObjectInputStream in;
    static ObjectOutputStream out;
}
