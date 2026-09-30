import java.net.URI;

public class URIConstruction {

    public static void main(String[] args) throws Exception {

        // 1. Complete URI text
        URI u1 = new URI(
            "https://example.com/a"
        );

        // 2. Build URI from parts
        URI u2 = new URI(
            "https",
            "example.com",
            "/a",
            "top"
        );

        // 3. URI.create()
        URI u3 = URI.create(
            "https://example.com/a"
        );

        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
    }
}
