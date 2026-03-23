// WAP to throw user define exdception no match found if string is not equal to MSBTE.

import java.util.*;

class MyException extends Exception {
    MyException(String s) {
        super(s);
    }
}

class Demo {
    public static void main(String arg[]) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        s = sc.next();

        try {
            if (s.equals("MSBTE")) {
                System.out.println("Strings are equal.");
            } else {
                throw new MyException("No match found");
            }
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}