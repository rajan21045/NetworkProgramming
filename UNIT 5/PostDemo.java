import java.net.*;
import java.io.*;

public class PostDemo {
  public static void main(String[] args) throws Exception {
    URL url = new URL("https://httpbin.org/post");
    HttpURLConnection uc = (HttpURLConnection) url.openConnection();
    uc.setRequestMethod("POST");
    uc.setDoOutput(true);                    // we will send a body
    uc.setRequestProperty("Content-Type",
        "application/x-www-form-urlencoded");

    String data = "name=Ram&course=NetProg";
    try (OutputStream os = uc.getOutputStream()) {
      os.write(data.getBytes("UTF-8"));      // body goes after header
    }
    System.out.println(uc.getResponseCode() + " "
        + uc.getResponseMessage());
    uc.disconnect();
  }
}