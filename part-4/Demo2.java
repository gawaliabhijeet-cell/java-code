// program to get the local host name and ip address using getAllByName() method

import java.net.*;
public class Demo2 {
    public static void main(String arg[]) throws Exception{
        InetAddress ip[] = InetAddress.getAllByName("www.yahoo.com");
        for(int i=0;i<ip.length;i++)
        {
            System.out.println(ip[i]);
        }
    }
    
}
