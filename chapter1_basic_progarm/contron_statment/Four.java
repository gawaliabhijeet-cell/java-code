
import java.util.Scanner;

public class Four {

    public static void main(String[] args) {
        int n, r1, r2, r3, r4, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter four digit number");
        n = sc.nextInt();
        r1 = n % 10;
        n = n / 10;
        r2 = n % 10;
        n = n / 10;
        r3 = n % 10;
        n = n / 10;
        r4 = n % 10;
        n = n / 10;
        sum = r1 + r2 + r3 + r4;
        System.out.println("sum of four digit is:" + sum);

    }
}
