// WAP put throw user define exception negetive age exception if entared age is -ve.

import java.util.*;

class MyException extends Exception {

    MyException(String s) {
        super(s);
    }

}

public class Demo1 {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a age:");
        age = sc.nextInt();
        try {
            if (age < 0) {

                throw new MyException("negative age exception.");
            } else {
                System.out.println("age display:" + age);
            }
        } catch (MyException e) {
            System.out.println(e);
        }
    }
}
