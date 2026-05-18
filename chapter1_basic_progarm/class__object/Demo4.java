// WAP to declare class account having member as accnoname,balance .
// accept the detail of 4 account and display the detail of account number of account having balanece more the 5000.

import java.util.*;

class Account {
    int accno;
    double balance;
    Scanner sc = new Scanner(System.in);

    void getdata() {
        System.out.println("enter accno,name:");
        accno = sc.nextInt();
        balance = sc.nextDouble();
    }

    void putdata() {
        if (balance > 5000) {
            System.out.println("accno:" + accno);

        }
    }
}

public class Demo4 {
    public static void main(String[] args) {
        Account a[] = new Account[3];
        int i;
        for (i = 0; i < 3; i++) {
            a[i] = new Account();
        }
        for (i = 0; i < 3; i++) {
            a[i].getdata();
        }
        for (i = 0; i < 3; i++) {
            a[i].putdata();
        }

    }
}
