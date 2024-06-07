import java.net.*;

public class reverseTest {
	public static void main(String[] args) {
		try {

			InetAddress ia = InetAddress.getByName("www.hamropatro.com");
			System.out.println(ia.getCanonicalHostName());
		} catch (UnknownHostException e) {
			System.out.println(e);
		}
	}
}
