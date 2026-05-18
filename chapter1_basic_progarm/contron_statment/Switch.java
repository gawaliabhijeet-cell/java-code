
import java.util.*;

public class Switch {

    public static void main(String args[]) {
        int a, b, c, ch;
        Scanner sc = new Scanner(System.in);

        System.out.println("1-addition 2-subtraction 3-multiplication 4-division");
        System.out.print("Enter choice: ");
        ch = sc.nextInt();

        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        switch (ch) {
            default:
                System.out.println("Wrong choice");
            case 1:
                c = a + b;
                System.out.println("Addition: " + c);
                break;

            case 2:
                c = a - b;
                System.out.println("Subtraction: " + c);
                break;

            case 3:
                c = a * b;
                System.out.println("Multiplication: " + c);
                break;

            case 4:
                if (b != 0) {
                    c = a / b;
                    System.out.println("Division: " + c);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

        }
    }
}
