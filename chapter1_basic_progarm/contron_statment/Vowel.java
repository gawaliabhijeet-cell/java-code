
import java.util.Scanner;

public class Vowel {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character:");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("character is a vowel:" + ch);
        } else {
            System.out.println("character is consonant:" + ch);
        }
    }

}
