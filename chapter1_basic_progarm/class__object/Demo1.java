// wap to declare class student having member variable rollno,name,percrntage accept the data of 1 student and display it.

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

class Demo1 {
    public static void main(String arg[]) {
        Student s = new Student();
        s.accept();
        s.putdata();
    }
}