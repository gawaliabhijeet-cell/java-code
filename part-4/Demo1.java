// program to get the local host name and ip address
import java.net.*;
public class Demo1 {    
    public static void main(String arg[]) throws Exception{
        InetAddress ip = InetAddress.getByName("www.github.com");
        System.out.println("host name:"+ip);
    }
}
