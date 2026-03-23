// dynamic method dispatch example in java.

class Animal {
    void sound() {
        System.out.println("animal makes a sounds");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("dog barks");
    }
}

class Demo3 {
    public static void main(String agr[]) {
        Animal a = new Animal();
        Dog d = new Dog();
        a.sound();
        a = d;
        a.sound();
    }
}