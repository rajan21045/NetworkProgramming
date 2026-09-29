import java.net.URL;

public class Comparing {
    public static void main(String[] args) throws Exception {
        URL url1 = new URL("http://www.ibiblio.org/nywc/");
        URL url2 = new URL("http://www.ibiblio.org/nywc/rw.html");
        URL url3 = new URL("http://www.ibiblio.org/nywc/");

        System.out.println(url1.equals(url2)); // false - different file path
        System.out.println(url1.equals(url3)); // true  - protocol, host, port and file all match
    }
}
