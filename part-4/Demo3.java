// InetAddress object provides methods like getHostName(), getHostAddress(), getAddress() and hashCode() .
import java.net.*;
public class Demo3 {
    public static void main(String arg[]) throws Exception{
        InetAddress ip = InetAddress.getByName("www.google.com");
        System.out.println(ip);
        System.out.println("host name:"+ip.getHostName());
        System.out.println("ip address:"+ip.getHostAddress());
        System.out.println("byte address:"+ip.getAddress());
        System.out.println("hash code:"+ip.hashCode());

    }
}
