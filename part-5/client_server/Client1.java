import java.io.*;
import java.net.*;

public class Client1 {
    public static void main(String arg[]) throws Exception {
        Socket s = new Socket("localhost", 1234);
        PrintWriter out = new PrintWriter(s.getOutputStream());
        out.println("hello server");
        out.flush();
        s.close();
    }
}
