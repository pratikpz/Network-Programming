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
				System.out.write(c);
			in.close();

		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
