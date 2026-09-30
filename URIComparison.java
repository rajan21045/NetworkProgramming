import java.net.URI;

public class URIComparison {
    public static void main(String[] args) {
        URI a = URI.create("http://example.com/a");
        URI b = URI.create("http://example.com/a");
        URI c = URI.create("http://example.com/b");

        System.out.println(a.compareTo(c)); // -1
        System.out.println(a.equals(b));    // true
        System.out.println(a.toString());  // http://example.com/a
    }
}
