// final keyword use for avoid of inheritance.

final class Demo {
    void putdata() {
        System.out.println("parent class");
    }
}

// class not inheritade
// becase of final keyword.

class Final3 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.putdata();
    }
}