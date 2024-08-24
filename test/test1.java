package test;

import java.io.*;
import java.net.*;

public class test1 {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost", 6000);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello Server");
			dout.flush();
			dout.close();
			s.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
