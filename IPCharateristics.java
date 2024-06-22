import java.net.*;
import java.util.Scanner;

public class IPCharateristics {

	public static void main(String[] args) {
		System.out.println("Enter Domain name");
		Scanner input = new Scanner(System.in);
		String Domain = input.nextLine();
		try {
			InetAddress address = InetAddress.getByName(Domain);

			if (address.isMulticastAddress()) {
				System.out.println(address + " is a  multicast address.");
			
				}

			if (address.isAnyLocalAddress()) {
				System.out.println(address + "is a wildcard address.");
			}

			if (address.isLoopbackAddress()) {
				System.out.println(address + "is loopback address.");
			}

			if (address.isLinkLocalAddress()) {
				System.out.println(address + " is a link-local address.");
			} else if (address.isSiteLocalAddress()) {
				System.out.println(address + " is a site-local address.");
			} else {
				System.out.println(address + " is a global address.");
			}
			
			} 

		 catch (UnknownHostException ex) {
			System.err.println("Could not resolve " + args[0]);
		}
	}

}
