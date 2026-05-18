// this can be used to call current class constructor.
// this canbe used to call the constructor from another constructor.

class Demo {

    public Demo() {

        this(13);
        System.out.println("no argument in constructor.");
    }

    Demo(int a) {
        this(12, 34);
        System.out.println("one argument in constructor.");
    }

    Demo(int a, int b) {
        System.out.println("two argument in constructor.");
    }
}

public class This2 {
    public static void main(String[] args) {
        Demo t1 = new Demo();
    }
}
