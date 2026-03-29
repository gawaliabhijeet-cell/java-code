// server side code

import java.io.*;
import java.net.*;
import java.util.*;

public class Server3 {
    public static void main(String arg[]) throws Exception {
        int result;
        ServerSocket ss=new ServerSocket(9999);
        Socket s=ss.accept();
        System.out.println("client is connectiong....");

        Scanner sc=new Scanner(s.getInputStream());
        int a=sc.nextInt();
        result = a*a;

        PrintWriter out= new PrintWriter(s.getOutputStream());
        out.println(result);
        out.flush();
        
        s.close();
        ss.close();
        sc.close();

    }
}
