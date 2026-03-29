// server code


import java.net.*;
import java.util.*;

class Server1{
    public static void main(String arg[]) throws Exception {
        ServerSocket ss=new ServerSocket(1234);
        Socket s=ss.accept();
        System.out.println("client connected");

        Scanner sc= new Scanner(s.getInputStream());
        String str=sc.nextLine(); // nextline() is used multeline and spaces 
        System.out.println("client says:"+str);

        sc.close();
        s.close();
        ss.close();
    }
    
}