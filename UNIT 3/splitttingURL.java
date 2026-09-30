import java.net.URL;
import java.net.MalformedURLException;

public class splitttingURL {

    public static void main(String[] args) {

        try {
            URL u = new URL(
                    "http://www.ora.com:80/goodparts?q=1#ch1"
            );

            System.out.println(u.getProtocol());
            // http

            System.out.println(u.getHost());
            // www.ora.com

            System.out.println(u.getPort());
            // 80

            System.out.println(u.getPath());
            // /goodparts

            System.out.println(u.getQuery());
            // q=1

            System.out.println(u.getRef());
            // ch1

            System.out.println(u.getFile());
            // /goodparts?q=1

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}