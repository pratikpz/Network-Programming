package exam;

import java.net.InetAddress;
import java.util.*;

public class IpType {
	public static void main(String[] args) {
		try {

			System.out.println("Enter ip address");

			Scanner sc = new Scanner(System.in);

			String ip = sc.nextLine();

			InetAddress ia = InetAddress.getByName(ip);
			System.out.println(ia);

			byte[] ipa = ia.getAddress();
			System.out.println(ipa);
			if(ipa.length==4){
				System.out.println("v4");

			}
			else if (ipa.length==16) {
				System.out.println("6");
			}
			else{
				System.out.println("invalid format");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
