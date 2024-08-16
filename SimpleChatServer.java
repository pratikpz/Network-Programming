import java.io.*;
import java.net.*;

public class SimpleChatServer {
    private static final int PORT = 12345;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Chat server is listening on port " + PORT);

            // Accept a single client connection
            try (Socket socket = serverSocket.accept()) {
                System.out.println("Client connected");

                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

                String messageFromClient;
                String messageFromServer;

                // Communication loop
                while (true) {
                    // Read message from client
                    messageFromClient = in.readLine();
                    if (messageFromClient == null || messageFromClient.equalsIgnoreCase("exit")) {
                        break;
                    }
                    System.out.println("Client: " + messageFromClient);

                    // Read and send message to client
                    System.out.print("Server: ");
                    messageFromServer = userInput.readLine();
                    out.println(messageFromServer);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
