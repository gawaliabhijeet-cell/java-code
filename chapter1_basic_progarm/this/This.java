class Demo {
    int a, b;

    Demo(int a1, int b1) {
        this.a = a1;
        this.b = b1;
    }

    void putdata() {
        System.out.println("a=" + a);
        System.out.println("b:" + b);
    }
}

class This {
    public static void main(String[] args) {
        Demo d = new Demo(12, 34);
        d.putdata();
    }
}
