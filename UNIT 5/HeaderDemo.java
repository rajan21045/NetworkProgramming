//Setting request headers
import java.net.*;
import java.io.*;

public class HeaderDemo {
  public static void main(String[] args) throws Exception {
    URL url = new URL("https://example.com");
    HttpURLConnection uc =
        (HttpURLConnection) url.openConnection();

    uc.setRequestProperty("User-Agent", "Mozilla/5.0");
    uc.setRequestProperty("Accept", "text/html");
    uc.setRequestProperty("Accept-Language", "en-US");
    uc.addRequestProperty("Cookie", "user=ram");

    System.out.println(uc.getRequestProperty("User-Agent"));
    System.out.println("Status: " + uc.getResponseCode());
  }
}