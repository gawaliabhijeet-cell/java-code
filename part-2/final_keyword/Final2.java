// to prevent method overriding using final keyword.

class Demo {
    final void putdata() {
        System.out.println("parent class");
    }
}

class Demo1 extends Demo {
    // final keyword is used.
    // method not override.

}

class final2 {

    public static void main(String arg[]) {
        Demo1 f = new Demo1();
        f.putdata();
    }
}