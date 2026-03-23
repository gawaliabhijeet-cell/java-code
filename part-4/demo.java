// program to get the local host name and ip address
import java.net.*;
class Demo
{
    public static void main(String args[]) throws Exception
    {
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("host name :"+ip);
        
    }
}