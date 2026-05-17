import java.net.InetAddress;
import java.util.Scanner;

public class ipAddress {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Take URL input from user
            System.out.print("Enter website URL: ");
            String url = sc.nextLine();

            // Get InetAddress object
            InetAddress ip = InetAddress.getByName(url);

            // Print host address
            System.out.println("Host Address: " + ip.getHostAddress());

        } catch (Exception e) {
            System.out.println("Invalid URL or Host not found.");
        }

        sc.close();
    }
}