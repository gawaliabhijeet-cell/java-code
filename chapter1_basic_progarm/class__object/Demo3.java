// WAP to declare class student having data members rollno,name,per.
//accept the  detail of  10 students and display it.

import java.util.*;

class Student {
    int rollno;
    String name;
    double per;
    Scanner sc = new Scanner(System.in);

    void accept() {
        System.out.println("enter rollno,name,per:");
        rollno = sc.nextInt();
        name = sc.next();
        per = sc.nextDouble();
    }

    void putdata() {
        System.out.println("rollno:" + rollno);
        System.out.println("name:" + name);
        System.out.println("per:" + per);
    }
}

public class Demo3 {
    public static void main(String arg[]) {
        Student s[] = new Student[10];// reference variable array
        int i;
        for (i = 0; i < 10; i++) {
            s[i] = new Student();// object creation
        }
        for (i = 0; i < 10; i++) {
            s[i].accept();
        }
        for (i = 0; i < 10; i++) {
            s[i].putdata();
        }

    }
}
