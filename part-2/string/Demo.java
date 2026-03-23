// WAP to count the no.of vowal presrent in a given string.

import java.util.*;

class Demo {
    public static void main(String arg[]) {
        String s;
        int i, len, count = 0;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        s = sc.nextLine();
        len = s.length();
        for (i = 0; i < len; i++) {
            ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        System.out.println("no.of vowel:" + count);
    }
}
