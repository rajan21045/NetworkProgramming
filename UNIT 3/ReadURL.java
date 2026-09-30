import java.net.*;
import java.io.*;

public class ReadURL {
    public static void main(String[] args) {

        try {
            URL url = URI.create("https://www.rajanpoudel.info.com").toURL();

            InputStream input = url.openStream();

            BufferedReader reader =
                new BufferedReader(new InputStreamReader(input));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}