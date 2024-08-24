package test;
import java.io.*;
import java.net.*;

public class LocalAddress{
	public static void main(String[] args) {
		try {
			InetAddress ia = InetAddress.getLocalHost();
			System.out.println(ia);
			String address = ia.getHostAddress();
			System.out.println(address);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}