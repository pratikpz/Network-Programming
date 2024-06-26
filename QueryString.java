import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class QueryString {
	private StringBuilder query = new StringBuilder();

	public synchronized void add(String name, String value) {
		if (query.length() > 0) {
			query.append('&');
		}
		encode(name, value);
	}

	private synchronized void encode(String name, String value) {
		try {
			query.append(URLEncoder.encode(name, "UTF-8"));
			query.append('=');
			query.append(URLEncoder.encode(value, "UTF-8"));
		} catch (UnsupportedEncodingException ex) {
			throw new RuntimeException("Broken VM does not support UTF-8", ex);
		}
	}

	public synchronized String getQuery() {
		return query.toString();
	}

	@Override
	public String toString() {
		return getQuery();
	}

	public static void main(String[] args) {
		QueryString qs = new QueryString();
		qs.add("name", "John Doe");
		qs.add("occupation", "Software Developer");
		qs.add("location", "New York");

		System.out.println(qs);
	}
}
