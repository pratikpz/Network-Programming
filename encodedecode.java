import java.net.URLEncoder;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class encodedecode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a URL: ");
        String url = scanner.nextLine();
        
        try {
            String encodedURL = URLEncoder.encode(url,"UTF-8");
            System.out.println("Encoded URL: " + encodedURL);
            
            String decodedURL = URLDecoder.decode(encodedURL,"UTF-8");
            System.out.println("Decoded URL: " + decodedURL);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
}