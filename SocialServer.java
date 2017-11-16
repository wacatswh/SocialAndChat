/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialserver;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author seoww
 */
public class SocialServer {

    static ArrayList<Client> clientArrayList = new ArrayList<>();
    static String[][] userData = new String[100][5];    // storing all user data
    static int arrIndex = 0;                            // general index for array
    static ArrayList<String> nameList = new ArrayList<>();
    static Socket socket = null;
    
    public static void main(String args[]) {
        final int port = 1338;
        
        ServerSocket serverSocket = null;
        // Socket socket = null;
        
        try {
            serverSocket = new ServerSocket(port);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        
        while(true) {
            try {
                Client c = new Client();
                c.socket = serverSocket.accept();
                c.in = new ObjectInputStream(c.socket.getInputStream());
                c.out = new ObjectOutputStream(c.socket.getOutputStream());
                
                clientArrayList.add(c);
                
                new Thread(new Handler(c)).start();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }  
    }
    
    static class Handler implements Runnable {
        private Client client;

        public Handler(Client c) {
            client = c;
        }

        @Override
        public void run() {
            try {
                // String inMessage = "";
                String[] tmpUser;

                System.out.println("Waiting");
                System.out.println("Connected");

                // REVIEW THE FLOW OF THIS BLOCK
                while (true) 
                {
                    tmpUser = (String[])client.in.readObject();
                    System.out.println("Friend array received!");
                    
                    // find out the index number for the requesting data
                    int index = 0;
                    
                    if (tmpUser[5].equals("reg"))       // Register
                    {
                        // check for duplicate
                        
                        if (nameList.contains(tmpUser[0]))
                        {
                            client.out.writeUTF("fail");
                            client.out.flush();
                            continue;
                        }
                        
                        client.out.writeUTF("ok");
                        
                        // note: userData is String[100][5]
                        // store incoming array into userData array
                        
                        for (int i = 0; i < 5; i++) {
                            userData[arrIndex][i] = tmpUser[i];
                        }
                        arrIndex++; // move the index for 1, after inputting a user into userData array
                        
                        //TimeUnit.SECONDS.sleep(3); // sleep for 3 second before broadcasting array to avoid race problem
                        
                        nameList.add(tmpUser[0]); // store username of userData array into namelist
                        
                        // send a string to client before sending namelist
                        // send nameList to all clients
                        for(Client cc : clientArrayList) {
                            cc.out.writeUTF("namelist");
                            cc.out.writeObject(nameList.toArray(new String[nameList.size()])); // ERROR HERE
                            cc.out.flush();
                        }
                    }
                    else if (tmpUser[5].equals("det"))      // Detail
                    {
                        index = nameList.indexOf(tmpUser[0]);
                        
                        String[] outArray = new String[3];
    
                        // return an array with dob, pob, music profile only
    
                        if (index != -1)
                        {
                            outArray[0] = userData[index][2];
                            outArray[1] = userData[index][3];
                            outArray[2] = userData[index][4];
                        }
                        else
                        {
                            outArray[0] = "";
                            outArray[1] = "";
                            outArray[2] = "";
                        }
                        
                        client.out.writeUTF("detail"); // send string to client before sending array
                        
                        client.out.writeObject(outArray);
                        client.out.flush();
                    }
                    else if (tmpUser[5].equals("out"))
                    {
                        // Logout handler
                        
                        // TODO: Remove user from name list
                        
                        break;
                    }
                }
                
                socket.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        }
    }
    
}
