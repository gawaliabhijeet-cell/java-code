// server side code

import java.io.*;
import java.net.*;
import java.util.*;

public class Server2 {
    public static void main(String arg[]) throws Exception {
        ServerSocket ss=new ServerSocket(9999);
        Socket s=ss.accept();
        System.out.println("client is connecting....");

        Scanner sc=new Scanner(s.getInputStream());
        String str=sc.nextLine();
        System.out.println("client says:"+str);

        PrintWriter out= new PrintWriter(s.getOutputStream());
        out.println("hello client");
        out.flush();

        s.close();
        ss.close();
        sc.close();

    }
}
