class Final1 {

    final int a = 10; // final variable must be initialized

    void putdata() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Final1 f = new Final1();
        f.putdata();
    }
}
