// WAP to count the no.of numeric charecter in a given string.

import java.util.*;

class Demo1 {
    public static void main(String[] args) {
        int i, len, count = 0;
        char ch;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        s = sc.nextLine();
        len = s.length();
        for (i = 0; i < len; i++) {
            ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                count++;
            }
        }
        System.out.println("numeric number count:" + count);
    }
}