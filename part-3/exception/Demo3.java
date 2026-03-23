// WAP to create use define exception "MIN_BAl" throw the exception when balance in account is below 500rupess.

import java.util.*;

class MIN_BALException extends Exception {

    public MIN_BALException(String s) {
        super(s);
    }

}

public class Demo3 {
    public static void main(String[] args) {
        double balance;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a balance:");
        balance = sc.nextDouble();

        try {
            if (balance < 500) {
                throw new MIN_BALException("balance lessthan 500.");
            } else {
                System.out.println("balance:" + balance);
            }
        } catch (MIN_BALException e) {
            System.out.println(e);
        }
    }
}
