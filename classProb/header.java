//Header Viewer in java

import java.net.URL;
import java.net.URLConnection;

public class header {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.google.com");
			URLConnection connection = url.openConnection();
			System.out.println("Content-Type: " + connection.getContentType());
			System.out.println("Content-Encoding: " + connection.getContentEncoding());
			System.out.println("Content-Length: " + connection.getContentLength());
			System.out.println("Date: " + connection.getDate());
			System.out.println("Last Modified: " + connection.getLastModified());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}






