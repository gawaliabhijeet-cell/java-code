// this can be used to call current class method.

class Demo {
    int a, b;

    Demo(int a1, int b1) {
        this.a = a1;
        this.b = b1;
        this.putdata();
    }

    void putdata() {
        System.out.println("a:" + a);
        System.err.println("b:" + b);
    }
}

public class This1 {
    public static void main(String arg[]) {
        Demo d1 = new Demo(12, 065);

    }
}
