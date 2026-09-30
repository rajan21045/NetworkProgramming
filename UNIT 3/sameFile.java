import java.net.URL;

public class sameFile {
    public static void ComparingSame(String[] args) throws Exception {
        URL url1 = new URL("https://site.com/index.html#part1");
        URL url2 = new URL("https://site.com/index.html#part2");

        System.out.println(url1.equals(url2));
        // false  - equals() treats different fragments as different URLs

        System.out.println(url1.sameFile(url2));
        // true   - sameFile() ignores the fragment, and the file matches
    }
}
