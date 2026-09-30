import java.io.*;
import java.net.*;

public class OpenConnectionExample {

    public static void main(String[] args) {

        try {
            // 1. Create URL object
            URL url = new URL("https://evexmove.com");

            // 2. Create URLConnection object
            URLConnection connection = url.openConnection();

            // 3. Set timeout
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            // 4. Display response information
            System.out.println("Content-Type: "
                    + connection.getContentType());

            System.out.println("Content-Length: "
                    + connection.getContentLengthLong());

            // 5. Get input stream
            InputStream input = connection.getInputStream();

            // 6. Convert bytes to characters
            InputStreamReader reader =
                    new InputStreamReader(input);

            // 7. Read characters line by line
            BufferedReader br =
                    new BufferedReader(reader);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // 8. Close reader
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}