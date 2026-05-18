
public class Consonent {

    public static void main(String args[]) {
        char ch;
        ch = args[0].charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("character is vowel: " + ch);
        } else {
            System.out.println("character is consonant: " + ch);
        }
    }

}
