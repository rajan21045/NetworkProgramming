import java.net.*;
import java.io.*;

public class Response {
  public static void main(String[] args) {
    for (String a : args) {
      try {
        URL u = new URL(a);
        HttpURLConnection uc = (HttpURLConnection) u.openConnection();
        System.out.println("HTTP/1.x " + uc.getResponseCode()
            + " " + uc.getResponseMessage());
        for (int j = 1; ; j++) {
          String h = uc.getHeaderField(j);
          String k = uc.getHeaderFieldKey(j);
          if (h == null || k == null) break;
          System.out.println(k + ": " + h);
        }
        InputStream in = new BufferedInputStream(uc.getInputStream());
        Reader r = new InputStreamReader(in);
        int c;
        while ((c = r.read()) != -1) System.out.print((char) c);
      } catch (MalformedURLException e) {
        System.err.println(a + " is not a parseable URL");
      } catch (IOException e) { System.err.println(e); }
    }
  }
}