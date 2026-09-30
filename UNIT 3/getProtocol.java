import java.net.URL;
import java.net.MalformedURLException;

public class getProtocol {
    public static void main(String[] args) {
        try {
            URL u1 = new URL("http://www.example.org/");
            System.out.println(u1.getProtocol());
            // prints: http

            URL u2 = new URL("ftp://ftp.example.org/");
            System.out.println(u2.getProtocol());
            // prints: ftp

        } catch (MalformedURLException e) {
            System.out.println(e);
        }
    }
}
