package network;

import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server started, waiting for client...");
        Socket socket = server.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("Hello from server!");
        System.out.println("Client says: " + in.readLine());
        socket.close();
        server.close();
    }
}
