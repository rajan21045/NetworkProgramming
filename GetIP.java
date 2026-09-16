import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIP {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("IP Address: " + ip.getHostAddress());
            System.out.println("Hostname: " + ip.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}