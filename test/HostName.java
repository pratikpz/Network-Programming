package test;
import java.io.*;
import java.net.*;

public class HostName {
	public static void main(String[] args) throws UnknownHostException{
		InetAddress ia = InetAddress.getByName("8.8.8.8");
		// System.out.println(ia.getCanonicalHostName());
		System.out.println(ia.getCanonicalHostName());
	}
	
}
