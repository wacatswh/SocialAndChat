/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialserver;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author seoww
 */
public class Client {
    public Socket socket;
    public ObjectInputStream in;
    public ObjectOutputStream out;
}
