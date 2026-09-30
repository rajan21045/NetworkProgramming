import java.io.*;
import java.net.*;

public class openStream {
  public static void main(String[] args) {
    try {
      URL url = new URL("https://google.com");

      InputStream in = url.openStream();
      BufferedReader r = new BufferedReader(
          new InputStreamReader(in));

      String line;
      while ((line = r.readLine()) != null) {
        System.out.println(line);
      }
      r.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
