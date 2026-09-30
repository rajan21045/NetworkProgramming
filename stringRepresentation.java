import java.net.URI;

public class stringRepresentation {
    public static void main(String[] args) {
        URI uri = URI.create(
                "https://example.com/search?q=java#top");

        String text = uri.toString();
        System.out.println(text);
        System.out.println(uri); // same result

    }
}
