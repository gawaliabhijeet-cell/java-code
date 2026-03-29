// client side code

import java.io.*;
import java.net.*;
import java.util.*;

public class Client2 {
    public static void main(String arg[]) throws Exception {
        Socket s=new Socket("localhost",9999);

        PrintWriter out=new PrintWriter(s.getOutputStream());
        out.println("Hello Server");
        out.flush();

        Scanner sc=new Scanner(s.getInputStream());
        String str=sc.nextLine();
        System.out.println("server says:"+str);

        s.close();
        sc.close();
    }
}
