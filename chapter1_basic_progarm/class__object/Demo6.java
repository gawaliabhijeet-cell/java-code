//WAP to declare class student having members rollno,name,per,
// accept the detail of 3 student and display the detail of student having highest percentage. 

import java.util.*;

class Student {
    int rollno;
    String name;
    double per;
    Scanner sc = new Scanner(System.in);

    void getdata() {
        System.out.println("Enter rollno,name,per:");
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

class Demo6 {
    public static void main(String args[]) {
        Student s[] = new Student[3];
        int i, j = 0;
        double l;
        for (i = 0; i < 3; i++) {
            s[i] = new Student();
        }
        for (i = 0; i < 3; i++) {
            s[i].getdata();
        }
        l = s[0].per;
        for (i = 0; i < 3; i++) {
            if (s[i].per > l) {
                l = s[i].per;
                j = i; // j will store the index of student with higerst percentage.

            }
        }
        s[j].putdata();
    }
}
