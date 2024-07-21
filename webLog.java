import java.io.*;
import java.net.*;

public class webLog {
    public static void main(String[] args) {
       

        try (
            FileInputStream fin = new FileInputStream(args[0]);
            Reader in = new InputStreamReader(fin);
            BufferedReader bin = new BufferedReader(in);
        ) {
            for (String entry = bin.readLine(); entry != null; entry = bin.readLine()) {
                int index = entry.indexOf(" ");
                if (index != -1) {
                    String ip = entry.substring(0, index);
                    String theRest = entry.substring(index);

                    try {
                        InetAddress address = InetAddress.getByName(ip);
                        System.out.println(address.getHostName() + theRest);
                    } catch (UnknownHostException e) {
                        System.out.println(entry);
                    }
                } else {
                    System.out.println(entry);
                }
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
