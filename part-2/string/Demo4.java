//WAP to accept first name,middle name and last name in a 3 different string and concate this 3 string to make full name

import java.util.*;

class Demo4 {
    public static void main(String[] args) {
        String s1, s2, s3, s4, s5;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first name:");
        s1 = sc.next();

        System.out.println("enter second name:");
        s2 = sc.next();

        System.err.println("enter last name:");
        s3 = sc.next();

        s4 = s1.concat(s2);
        s5 = s4.concat(s4);
        System.out.println(s5);
    }
}