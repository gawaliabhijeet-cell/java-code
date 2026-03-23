// WAP to throw a userdefine exception string mismatch exception if 2 string are not equal.

import java.util.*;

class StringMismatchException extends Exception {

    public StringMismatchException(String s) {
        super(s);
    }

}

public class Demo2 {
    public static void main(String[] args) {
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first string:");
        s1 = sc.next();
        System.out.println("enter a second string:");
        s2 = sc.next();
        try {
            if (s1.equals(s2)) {
                System.out.println("string are equal.");
            } else {
                throw new StringMismatchException("string are not equal:");
            }
        } catch (StringMismatchException e) {
            System.out.println(e);
        }
    }
}
