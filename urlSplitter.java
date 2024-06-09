import java.net.*;

public class urlSplitter {

	public static void main(String[] args) {

		try {
			URL url = new URL(
					"https://www.example.com:8080/articles/2024/06/09/web-development?topic=full-url#comments\r\n");
			System.out.println("Protocol: " + url.getProtocol());
			System.out.println("Host: " + url.getHost());
			System.out.println("Port: " + url.getPort());
			System.out.println("File: " + url.getFile());

			String host = url.getHost();
			if (host != null) {
				int atSign = host.indexOf('@');
				if (atSign != -1)
					host = host.substring(atSign + 1);

			} else {
				System.out.println("Host is null");
			}
		} catch (MalformedURLException e) {
			System.out.println(e);
		}

	}
}
