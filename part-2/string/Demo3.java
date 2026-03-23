
// WAP to display the string in a reverse order.
import java.util.*;

class Demoe3 {
    public static void main(String[] args) {
        int i, len;
        String s;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        s = sc.nextLine();
        len = s.length();
        for (i = len - 1; i >= 0; i--) {
            ch = s.charAt(i);
            System.out.print(ch);
        }
    }
}