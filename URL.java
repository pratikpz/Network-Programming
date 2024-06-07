import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.io.IOException;

public class URLExample {
    public static void main(String[] args) {
        String urlString = "http://www.audubon.org/";
        
        try {
            URI uri = new URI(urlString);
            
            URL url = uri.toURL();
            
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);
            
            System.out.println("URL created successfully: " + url.toString());
            
        } catch (URISyntaxException ex) {
            System.out.println("The URL is malformed: " + ex.getMessage());

        } catch (MalformedURLException ex) {

            System.out.println("The URL is malformed: " + ex.getMessage());
        } catch (IOException ex) {
			
            System.out.println("An I/O error occurred: " + ex.getMessage());
        }
    }
}
