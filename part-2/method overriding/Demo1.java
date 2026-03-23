// method overriding example in java.

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

class Cat extends Animal {
    void sound() {
        System.out.println("cat meows");
    }
}

class Demo1 {
    public static void main(String args[]) {

        Cat c = new Cat();
        c.sound();
    }

}