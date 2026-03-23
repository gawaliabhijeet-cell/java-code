
class Student {
    int rollno;

    void getno(int r) {
        rollno = r;

    }

    void putno() {
        System.out.println("rollno:" + rollno);
    }
}

class Text extends Student {
    int mark1, mark2, mark3;

    void getmark(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    void putmark() {
        System.out.println("mark1:" + mark1);
        System.out.println("mark2:" + mark2);
        System.out.println("mark3:" + mark3);
    }
}

interface Sport {
    int sportwt = 6;

    void putwt();

}

class Result extends Text implements Sport {
    int total;

    public void putwt() {
        System.out.println("Sportwt:" + sportwt);
    }

    void display() {
        total = mark1 + mark2 + mark3 + sportwt;
        System.out.println("total:" + total);
    }

}

class Demo {
    public static void main(String[] args) {
        Result r = new Result();
        r.getno(11);
        r.putno();
        r.getmark(50, 70, 40);
        r.putmark();
        r.putwt();
        r.display();
    }
}