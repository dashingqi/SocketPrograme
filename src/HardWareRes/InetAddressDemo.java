package HardWareRes;

        import java.net.InetAddress;
        import java.net.UnknownHostException;

public class InetAddressDemo {

    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            String hostAddress = localHost.getHostAddress();
            System.out.println("hostAddress = " + hostAddress);
            String hostName = localHost.getHostName();
            System.out.println("hostName = " + hostName);
            byte[] address = localHost.getAddress();
            for (byte value : address) {
                System.out.println(value);
            }

            InetAddress otherAddress = InetAddress.getByName("");


        } catch (UnknownHostException e) {
            e.printStackTrace();

        }


    }
}
