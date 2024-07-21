import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class urldata {
	public static void main(String[] args) {
		try {
			URL u = new URL("http://lolcats.com");
			InputStream in = u.openStream();
			int c;
			while ((c = in.read()) != -1)
				System.out.write(c) ;// write() method is used to write the specified byte to the output stream.
			in.close();

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}



/*
 * import java.io.*;
import java.net.*;

public class URLDataRetriever {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java URLDataRetriever <url>");
            return;
        }

        String urlString = args[0];
        try {
            URL url = new URL(urlString);
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + urlString);
        } catch (IOException e) {
            System.out.println("Error reading from URL: " + e.getMessage());
        }
    }
}

 */
