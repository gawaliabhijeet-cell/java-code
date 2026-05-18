
import java.util.*;

class Palandrome {

    public static void main(String args[]) {
        int n, rev, sum = 0, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        n = sc.nextInt();
        t = n;
        while (n != 0) {
            rev = n % 10;
            sum = sum * 10 + rev;
            n = n / 10;
        }
        if (t == sum) {
            System.out.println("number is palansdrome.");
        } else {
            System.out.println("number is not palansdrome.");
        }
    }
}
