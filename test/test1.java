package test;

import java.io.*;
import java.net.*;

public class test1 {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost", 6000);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello Server");
			DataInputStream dt = new DataInputStream(s.getInputStream());
			String msg = dt.readUTF();
			System.out.println(msg);
			dt.close();
			dout.flush();
			dout.close();
			s.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
