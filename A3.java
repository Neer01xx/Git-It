package com.patilneeraj;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] arg) throws Exception{
        ServerSocket welcomeServer = new ServerSocket(7405);
        while (true){
            try {
                Socket connectionSocket = welcomeServer.accept();
                DataInputStream inFromClient = new DataInputStream(connectionSocket.getInputStream());
                DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
                int clientInput = inFromClient.readInt();
                System.out.println("Received: " + clientInput);
                int reverse = 0;
                while(clientInput != 0)
                {
                    int remainder = clientInput % 10;
                    reverse = reverse * 10 + remainder;
                    clientInput = clientInput/10;
                }
                outToClient.writeInt(reverse);
            } catch (Exception e){
                System.out.println("Exception occured "+ e);
            }
        }
    }
}
