package org.example;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class TCPServer {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(5678);

        while (true) {

            System.out.println("Server is ready for accepting a file");
            Socket connection = serverSocket.accept();
            InputStream inputStream = connection.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);

            int messageLength = dataInputStream.readInt();
            byte[] message = new byte[messageLength];
            dataInputStream.readFully(message);
            System.out.println("File is accepted");

        }


    }


}


