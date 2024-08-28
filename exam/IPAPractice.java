package exam;

import java.net.*;

public class IPAPractice {
	public static void main(String[] args) {
		try {
			InetAddress ia = InetAddress.getLocalHost();

			System.out.println(ia.getHostAddress());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
