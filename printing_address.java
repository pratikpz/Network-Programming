import java.net.*;
public class network{
public static void main(String[] args){
try{
InetAddress address = InetAddress.getByName("www.google.com");
System.out.println(address);
}
catch(UnknownHostException ex){
System.out.println("Could not find google.com");
}
}
}
