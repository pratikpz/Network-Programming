import java.net.MalformedURLException;
import java.net.URL;

public class URLEquality {
	public static void main(String[] args){
		try {
			URL www = new URL("https://www.ibiblio.org");
			URL ibiblio = new URL("https://ibiblio.org");

			if (ibiblio.equals(www)) {
				System.out.println(www + " is the same as " + ibiblio);
			} else {
				System.out.println(www + " is not the same as " + ibiblio);
			}
			
		} catch (MalformedURLException e) {
			System.out.println(e);
		}

	}
}
