
import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a > b) {
            System.out.println(a + " is largest number");
        } else {
            System.out.println(b + " is largest number");
        }
    }

}
