// server side code

import java.io.*;
import java.net.*;
import java.util.*;

public class Server4 {
       public static void main(String arg[])  throws Exception {
        String result;
        ServerSocket ss=new ServerSocket(9999);
        Socket s=ss.accept();
        System.out.println("client is connecting....");

        Scanner sc=new Scanner(s.getInputStream());
        int n=sc.nextInt();

        if(n%2==0){
            result="even";
        }
        else{
            result= "odd";
        }

        PrintWriter out=new PrintWriter(s.getOutputStream());
        out.println(result);
        out.flush();

        s.close();
        ss.close();
        sc.close();

       }
}
