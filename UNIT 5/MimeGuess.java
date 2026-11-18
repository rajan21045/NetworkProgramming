import java.net.*;
import java.io.*;
//Guessing the MIME type
public class MimeGuess {
  public static void main(String[] args) throws Exception {
    // 1) from the file name
    String t1 = URLConnection.guessContentTypeFromName("notes.pdf");
    System.out.println(t1);             // application/pdf

    // 2) from the first bytes of a stream ("magic numbers")
    InputStream in = new BufferedInputStream(
        new FileInputStream("photo.gif"));   // mark() needed
    String t2 = URLConnection.guessContentTypeFromStream(in);
    System.out.println(t2);             // image/gif
  }
}
// Table lives in content-types.properties (jre/lib)