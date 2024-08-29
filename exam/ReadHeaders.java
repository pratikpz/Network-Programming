package exam;
import java.net.HttpURLConnection;
import java.net.URL;

public class ReadHeaders {
    public static void main(String[] args) {
        String urlString = "https://www.example.com"; 
        
        try {
            URL url = new URL(urlString);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("HEAD");

            connection.connect();

            int i = 1; 
            String headerName;
            while ((headerName = connection.getHeaderFieldKey(i)) != null) {
                String headerValue = connection.getHeaderField(i);
                System.out.println(headerName + ": " + headerValue);
                i++;
            }

            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// i am preparing for my exam and i want to cover all these as quick as possible...can you create the question most likely to come in exam...and also a common program which can be used as solution of multiple question. like mention those common question and give one solution. but for the problems totally unrelated to each other do it separately