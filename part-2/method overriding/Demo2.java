//  constructor excution order in inheritance.

class A {
    A() {
        System.out.println("A is constructor called.");
    }
}

class B extends A {
    B() {
        System.out.println("B is constructor called.");

    }
}

class C extends B {
    C() {
        System.out.println("C is constructor called.");
    }
}

class Demo2 {
    public static void main(String[] args) {
        C c1 = new C();

    }
}
