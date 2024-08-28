package exam;

import java.net.*;
import java.util.Enumeration;
import java.io.*;

public class IPA {
	public static void main(String[] args) {

		try {
			InetAddress ia = InetAddress.getLocalHost();

			NetworkInterface networkInterface = NetworkInterface.getByInetAddress(ia);

			System.out.println(ia.getHostAddress() + "  ");

			Enumeration mac = networkInterface.getNetworkInterfaces();

			// while(mac.hasMoreElements()){
			// 	System.out.println(mac.nextElement());
			// }


			byte[] macbyte = networkInterface.getHardwareAddress();

			StringBuilder macaddress = new StringBuilder();

			for(int i=0 ; i<macbyte.length;i++){
				macaddress.append(String.format("%02x", macbyte[i]));
				if(i<macbyte.length-1){
					macaddress.append("-");
				}
			}

			System.out.println("Mac address is ++++"+macaddress.toString());
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
