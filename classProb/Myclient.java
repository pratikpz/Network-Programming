import java.io.*;
import java.net.*;
public class Myclient {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost", 6666);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello Server");

			DataInputStream din = new DataInputStream(s.getInputStream());
			String str = (String) din.readUTF();
			System.out.println("message= " + str);

			din.close();

			dout.flush();
			dout.close();
			s.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
