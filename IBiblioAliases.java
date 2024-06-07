import java.net.*;
import java.io.*;

public class IBiblioAliases {

    public static void main(String[] args) {
        try {
            InetAddress ibiblio = InetAddress.getByName("www.facebook.com");
            InetAddress helios = InetAddress.getByName("www.youtube.com");

            if (ibiblio.isReachable(1000)) {
                System.out.println("www.facebook.com is reachable");
            } else {
                System.out.println("www.facebook.com is not reachable");
            }

            if (ibiblio.equals(helios)) {
                System.out.println("They both are same");
            } else {
                System.out.println("They are not same");
            }
        } catch (UnknownHostException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println("Error checking reachability: " + e.getMessage());
        }
    }
}
