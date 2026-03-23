// WAP to read 10 string from console and print sorted string on console.

import java.util.Scanner;

class Demo5 {
    public static void main(String[] args) {
        String s[] = new String[10];
        int i, j;
        String t;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 strings:");
        for (i = 0; i < 10; i++) {
            s[i] = sc.nextLine(); // ✅ reading input
        }

        // Sorting (Bubble Sort style)
        for (i = 0; i < 9; i++) {
            for (j = i + 1; j < 10; j++) {
                if (s[i].compareTo(s[j]) > 0) {
                    t = s[i];
                    s[i] = s[j];
                    s[j] = t;
                }
            }
        }

        System.out.println("Sorted strings are:");
        for (i = 0; i < 10; i++) {
            System.out.println(s[i]);
        }
    }
}
