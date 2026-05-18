
import java.util.*;

public class Fabonnocis {

    public static void main(String args[]) {
        int f1 = 0, f2 = 1, f3 = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        n = sc.nextInt();
        System.out.print(f1 + " " + f2);
        while (f3 <= n) {
            System.out.print(" " + f3);
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }

    }
}
