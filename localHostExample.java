import java.net.InetAddress;
import java.net.UnknownHostException;
public class localHostExample{
    public static void main(String[] args) {
        try{
            //1. Invoke the factory method to get the InetAddress object
            InetAddress inetAddress = InetAddress.getLocalHost();

            //2. Print the default string representation(format: hostname/IP address)
            System.out.println("Default Object Representation: "+ inetAddress);

            //3. Get the hostname
            String hostname = inetAddress.getHostName();
            String ipAddress = inetAddress.getHostAddress();

            System.out.println("Hostname: " + hostname);
            System.out.println("IP Address: " + ipAddress);

        } catch (UnknownHostException e) {
            System.out.println("Could not resolve the local host address.");
            e.printStackTrace();
        }
    }
}