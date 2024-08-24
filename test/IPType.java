package test;

import java.net.InetAddress;

public class IPType {
	public int getVersion(String ipadress) {
		try {

			InetAddress ia = InetAddress.getByName(ipadress);
			byte[] address = ia.getAddress();

			if (address.length == 4)
				return 4;
			else if (address.length == 16)
				return 6;
			else
				return -1;
		} catch (Exception e) {
			System.out.println(e);
			return -1;
		}
	}

	public static void main(String[] args) {

		IPType ip = new IPType();
		int version = ip.getVersion("2001:db8:85a3::8a2e:370:7334");
		System.out.println("The ip address is of type IpV" + version);
	}

}
