/* 1) client should send a number to a server
    2) server should check if the number is even or odd and send response to client */

    // client side code

import java.io.*;
import java.net.*;
import java.util.*;

public class Client4 {
    public static void main(String arg[]) throws Exception {
        Socket s=new Socket("localhost",9999);

        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();

        PrintWriter out= new PrintWriter(s.getOutputStream());
        out.println(n);
        out.flush();

        Scanner sc1= new Scanner(s.getInputStream());
        String sr=sc1.next();
        System.out.println("server says:"+sr);

        s.close();
        sc.close();
        sc1.close();
        
    }
}
