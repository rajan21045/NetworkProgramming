import java.net.URI;

public class URIPaths {
    public static void main(String[] args) {
        URI base = URI.create("http://example.com/docs/");
        URI full = base.resolve("img/a.png");
        URI shortForm = base.relativize(full);
        URI clean = URI.create("http://example.com/a/../b/./c.html").normalize();

        System.out.println("Resolved   = " + full);
        System.out.println("Relative   = " + shortForm);
        System.out.println("Normalized = " + clean);
    }
}
