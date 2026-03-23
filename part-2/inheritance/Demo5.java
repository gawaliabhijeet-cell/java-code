import java.util.*;

class Student {
    int rollno;
    String name;

    void student_info(Scanner sc) {
        System.out.println("Enter Student Roll No:");
        rollno = sc.nextInt();
        System.out.println("Enter Student Name:");
        name = sc.next();
    }

    void student_disp() {
        System.out.println("Roll No of Student is: " + rollno);
        System.out.println("Name of the Student is: " + name);
    }
}

class Test extends Student {
    int test1, test2;

    void test_info(Scanner sc) {
        System.out.println("Enter your test one marks:");
        test1 = sc.nextInt();
        System.out.println("Enter your test two marks:");
        test2 = sc.nextInt();
    }

    void test_disp() {
        System.out.println("Your first test marks is: " + test1);
        System.out.println("Your second test marks are: " + test2);
    }
}

class Demo5s {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Test t7 = new Test();
        t7.student_info(sc);
        t7.test_info(sc);

        System.out.println("*******STUDENT INFORMATION*******");
        t7.student_disp();
        t7.test_disp();

        sc.close();
    }
}
