import java.io.IOException;
import java.net.*;

public class GetContentExample {

    public static void main(String[] args) {

        try {
            // 1. Create URL object
            URL url = new URL("https://evexmove.com");

            // 2. Get content from the URL
            Object content = url.getContent();

            // 3. Display the type of object received
            System.out.println(
                    "Content type: "
                    + content.getClass().getName()
            );

            // 4. Display the content object
            System.out.println(
                    "Content: "
                    + content
            );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}