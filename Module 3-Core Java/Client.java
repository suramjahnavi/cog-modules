import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        System.out.println("Connected to server.");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String serverMsg, clientMsg;

        while (true) {
            System.out.print("Client: ");
            clientMsg = console.readLine();
            out.println(clientMsg);
            if (clientMsg.equalsIgnoreCase("bye")) break;

            serverMsg = in.readLine();
            System.out.println("Server: " + serverMsg);
        }

        socket.close();
        System.out.println("Client closed.");
    }
}