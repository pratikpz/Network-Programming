package exam;
import java.net.HttpURLConnection;
import java.net.URL;

public class ReadHeaders {
    public static void main(String[] args) {
        String urlString = "https://www.example.com"; // Replace with the desired URL
        
        try {
            URL url = new URL(urlString);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("HEAD");

            connection.connect();

            int i = 1; 
            String headerName;
            while ((headerName = connection.getHeaderFieldKey(i)) != null) {
                String headerValue = connection.getHeaderField(i);
                System.out.println(headerName + ": " + headerValue);
                i++;
            }

            // Close the connection
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
