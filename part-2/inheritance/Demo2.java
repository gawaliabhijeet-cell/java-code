interface Exam {
    int sportwt = 20;
}

class Student {
    int rollno;
    String name;
    int mark1, mark2, mark3;

    void getdata(int r, String n, int m1, int m2, int m3) {
        rollno = r;
        name = n;
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }
}

class Result extends Student implements Exam {
    int total;
    double per;

    void calpercentage() {
        total = mark1 + mark2 + mark3 + sportwt;
        per = total / 3.0;
    }

    void display() {
        System.out.println("Rollno: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Mark1: " + mark1);
        System.out.println("Mark2: " + mark2);
        System.out.println("Mark3: " + mark3);
        System.out.println("Sportwt: " + sportwt);
        System.out.println("Total: " + total);
        System.out.println("per:" + per);
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Result r = new Result();
        r.getdata(11, "abhi", 10, 20, 30);
        r.calpercentage();
        r.display();
    }
}
