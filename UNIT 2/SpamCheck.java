import java.net.InetAddress;
import java.net.UnknownHostException;

public class SpamCheck {

    public static final String BLACKHOLE = "sbl.spamhaus.org";

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Usage: java SpamCheck <IP Address>");
            return;
        }

        for (String ip : args) {
            if (isSpammer(ip)) {
                System.out.println(ip + " is a known spammer.");
            } else {
                System.out.println(ip + " is not listed as a spammer.");
            }
        }
    }

    public static boolean isSpammer(String ip) {
        try {
            String query = reverseIP(ip) + "." + BLACKHOLE;

            // DNS lookup
            InetAddress.getByName(query);

            // If lookup succeeds, IP is blacklisted
            return true;

        } catch (UnknownHostException e) {
            // Not found in blacklist
            return false;
        }
    }

    private static String reverseIP(String ip) {
        String[] parts = ip.split("\\.");

        if (parts.length != 4) {
            throw new IllegalArgumentException("Invalid IP address: " + ip);
        }

        return parts[3] + "." + parts[2] + "." + parts[1] + "." + parts[0];
    }
}