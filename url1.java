import java.net.*;

public class url1 {
    public static void main(String[] args) {

        try {
            // 1) Full URL as one string
            URL url1 = new URL("https://www.google.com/search");

            // 2) Protocol, host, file (default port)
            URL url2 = new URL("http", "www.google.com", "/protest");

            // 3) Protocol, host, port, file
            URL url3 = new URL("http", "www.google.com", 8080, "/protest");

            // 4) Base URL + relative URL
            URL url4 = new URL(url3, "index.html");

            System.out.println("URL 1: " + url1);
            System.out.println("URL 2: " + url2);
            System.out.println("URL 3: " + url3);
            System.out.println("URL 4: " + url4);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}