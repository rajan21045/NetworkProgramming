import java.net.*;
import java.util.Arrays;
public class getter_method {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("rajanpoudel.info.np");
            System.out.println("Host Name: "+ address.getHostName());
            System.out.println("Canonical Host Name: "+ address.getCanonicalHostName());
            System.out.println("IP Address: "+ address.getHostAddress());
            System.out.println("Raw Address: "+ Arrays.toString(address.getAddress()));
        } catch (UnknownHostException e) {
            System.out.println("Could not resolve host: " + e.getMessage());
        }
    }
}
