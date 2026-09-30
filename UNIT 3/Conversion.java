import java.net.URI;
import java.net.URL;

public class Conversion {
    public static void main(String[] args) throws Exception {
        URL url = new URI("https://example.com").toURL();
        URI uri = url.toURI();

        System.out.println("URL = " + url);
        System.out.println("URI = " + uri);
        System.out.println("Text = " + uri.toString());
        System.out.println("URL again = " + uri.toURL());
    }
}
