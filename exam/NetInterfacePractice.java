package exam;
import java.net.*;
import java.util.Enumeration;

public class NetInterfacePractice {
	public static void main(String[] args) {
		try {
			
			InetAddress ia = InetAddress.getLocalHost();
			NetworkInterface n = NetworkInterface.getByInetAddress(ia);
			
			Enumeration e = n.getNetworkInterfaces();

			while(e.hasMoreElements()){
				System.out.println(e.nextElement());
			}

			byte[] mad = n.getHardwareAddress();
			StringBuilder str = new StringBuilder();
			for(int i=0;i<mad.length;i++){
				str.append(String.format("%02x", mad[i]));
				if(i<mad.length-1){
					str.append("-");
				}
			}

			System.out.println(str);

		} catch (Exception e) {

		}
	}
}
