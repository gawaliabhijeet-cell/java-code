// WAP to declare class student having data members rollno,name,per.

class Student {
    int rollno;
    String name;
    double per;

    void getdata(int r, String n, double p) {
        rollno = r;
        name = n;
        per = p;
    }

    void putdata() {
        System.out.println("rollno:" + rollno);
        System.out.println("name:" + name);
        System.out.println("per:" + per);
    }
}

public class Demo2 {
    public static void main(String arg[]) {
        Student s = new Student();
        s.getdata(11, "abhijeet", 91.23);
        s.putdata();
    }
}