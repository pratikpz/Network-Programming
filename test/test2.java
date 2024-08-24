package test;
import java.io.*;
import java.net.*;

public class test2 {
	public static void main(String[] args) {
		try {
			
			ServerSocket ss = new ServerSocket(6000);
			Socket s = ss.accept();
			DataInputStream dt = new DataInputStream(s.getInputStream());
			String st = (String) dt.readUTF();
			System.out.println("Message is :::::  "+st);

			dt.close();
			s.close();
			ss.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
