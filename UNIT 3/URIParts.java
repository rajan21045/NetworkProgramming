import java.net.URI;

public class URIParts {
    public static void main(String[] args)
            throws Exception {
        URI u = new URI(
            "http://bob@example.com:8080/a.html?id=5#top");

        System.out.println("scheme   = " + u.getScheme());
        System.out.println("host     = " + u.getHost());
        System.out.println("port     = " + u.getPort());
        System.out.println("path     = " + u.getPath());
        System.out.println("query    = " + u.getQuery());
        System.out.println("fragment = " + u.getFragment());
    }
}
