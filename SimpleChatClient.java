import java.io.*;
import java.net.*;

public class SimpleChatClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            System.out.println("Connected to chat server");

            String userMessage;
            String serverMessage;

            // Communication loop
            while (true) {
                // Read and send message to server
                System.out.print("Client: ");
                userMessage = userInput.readLine();
                out.println(userMessage);

                // Check for exit condition
                if (userMessage.equalsIgnoreCase("exit")) {
                    break;
                }

                // Read and display message from server
                serverMessage = in.readLine();
                System.out.println("Server: " + serverMessage);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
