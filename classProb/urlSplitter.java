// import java.net.*;

// public class urlSplitter {

// 	public static void main(String[] args) {

// 		try {
// 			URL url = new URL(
// 					"https://www.example.com:8080/articles/2024/06/09/web-development?topic=full-url#comments\r\n");
// 			System.out.println("Protocol: " + url.getProtocol());
// 			System.out.println("Host: " + url.getHost());
// 			System.out.println("Port: " + url.getPort());
// 			System.out.println("File: " + url.getFile());
// 			System.out.println("Path: " + url.getPath());
// 			System.out.println("Ref: " + url.getRef());
// 			System.out.println("Query: " + url.getQuery());

// 		} catch (MalformedURLException e) {
// 			System.out.println(e);
// 		}

// 	}
// }



import java.net.URL;
import java.net.MalformedURLException;

public class urlSplitter {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java URLSplitter <url1> <url2> ... <urlN>");
            return;
        }

        for (String urlString : args) {
            try {
                URL url = new URL(urlString);
                System.out.println("URL: " + urlString);
                System.out.println("Protocol: " + url.getProtocol());
                System.out.println("Host: " + url.getHost());
                System.out.println("Port: " + url.getPort());
                System.out.println("Path: " + url.getPath());
                System.out.println("Query: " + url.getQuery());
                System.out.println("File: " + url.getFile());
                System.out.println("Ref: " + url.getRef());
                System.out.println("UserInfo: " + url.getUserInfo());
                System.out.println();
            } catch (MalformedURLException e) {
                System.out.println("Invalid URL: " + urlString);
                System.out.println();
            }
        }
    }
}
