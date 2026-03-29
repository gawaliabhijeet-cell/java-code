// client side code

import java.io.*;
import java.net.*;
import java.util.*;

public class Client3 {
    public static void main(String arg[]) throws Exception {
        Socket s=new Socket("localhost",9999);

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter a number:");

        PrintWriter out=new PrintWriter(s.getOutputStream());
        out.println(a);
        out.flush(); // Flushes the stream.

        Scanner sc1=new Scanner(s.getInputStream());
        int result=sc1.nextInt();
        System.out.println("result is => "+ result);

        s.close();
        sc.close();
        sc1.close();
    }   
}
