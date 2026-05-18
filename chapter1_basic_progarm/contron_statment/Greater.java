
import java.util.*;

public class Greater {

    public static void main(String args[]) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("a is greater:" + a);

        } else if (b > c && b > a) {
            System.out.println("b is greater:" + b);

        } else {
            System.out.println("c is greater:" + c);
        }

    }
}
