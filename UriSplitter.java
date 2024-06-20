import java.net.URI;
import java.net.URISyntaxException;

public class UriSplitter {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            try {
                URI u = new URI(args[i]);
                System.out.println("The URI is " + u);
                System.out.println("The scheme is " + u.getScheme());
                System.out.println("The scheme specific part is " + u.getSchemeSpecificPart());
                System.out.println("The fragment is " + u.getFragment());

                String host = u.getHost();
                if (host != null) {
                    int atSign = host.indexOf('@');
                    if (atSign != -1)
                        host = host.substring(atSign + 1);
                    System.out.println("The host is " + host);
                } else {
                    System.out.println("The host is null.");
                }

                try {
                    u = u.parseServerAuthority();
                    System.out.println("The host is " + u.getHost());
                    System.out.println("The user info is " + u.getUserInfo());
                    System.out.println("The port is " + u.getPort());
                } catch (URISyntaxException e) {
                    System.out.println("The authority is " + u.getAuthority());
                }

                System.out.println("The port is " + u.getPort());
                System.out.println("The path is " + u.getPath());
                System.out.println("The user info is " + u.getUserInfo());
                System.out.println("The query string is " + u.getQuery());
            } catch (URISyntaxException e) {
                System.err.println(args[i] + " is not a URL I understand.");
            }
        }
    }
}
