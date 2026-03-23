
// WAP to colunt the number of occurance of character 'a' in a given string.
import java.util.Scanner;

class Demo2 {
    public static void main(String[] args) {
        int i, len, count = 0;
        String s;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        s = sc.nextLine();
        len = s.length();
        for (i = 0; i < len; i++) {
            ch = s.charAt(i);
            if (ch == 'a' || ch == 'A') {
                count++;
            }
        }
        System.out.println("no of character in a:" + count);
    }
}