class Student {
    int rollno;
    String name;

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    void putdata() {
        System.out.println("rollno:" + rollno);
        System.out.println("name:" + name);
    }
}

class Test extends Student {
    int mark1, mark2;

    Test(int m1,int m2)
    {
        super(int r,String n,int m1,int m2);
        mark1=m1;
        mark2=m2;
    }

    void putdata() {
        System.out.println("mark1:" + mark1);
        System.out.println("mark2:" + mark2);
    }
}

class