import java.net.*;

class NP {
    public static void main(String[] args) {
        try {
            InetAddress local = InetAddress.getByName("127.0.0.1");
            NetworkInterface ni = NetworkInterface.getByInetAddress(local);
            if (ni == null) {
                System.err.println("That's weird");
            } else {
                System.out.println("Network Interface found: " + ni.getDisplayName());
            }
        } catch (SocketException ex) {
            System.err.println("SocketException: " + ex.getMessage());
        } catch (UnknownHostException ex) {
            System.out.println("Couldn't find: " + ex.getMessage());
        }
    }
}
