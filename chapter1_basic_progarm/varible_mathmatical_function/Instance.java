
class Instance {

    int a = 5;

    public static void main(String args[]) {
        Instance o = new Instance();
        System.out.println(o.a); //inside static method
        o.putdata();

    }

    void putdata() {
        System.out.println(a); //inside instance method
    }
}
