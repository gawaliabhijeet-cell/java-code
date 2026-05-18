
import java.util.*;

public class Two {

    public static void main(String[] args) {
        int a, b, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number");

        a = sc.nextInt();
        b = sc.nextInt();
        t = a;
        a = b;
        b = t;

        System.out.println("after swapping" + a + " " + b);

    }
}
