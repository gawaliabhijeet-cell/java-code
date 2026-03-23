class Text {
    void getdata(int a, int b) {
        System.out.println("Sum:" + (a + b));

    }

    void getdata(double a, double b) {
        System.out.println("Sum:" + (a + b));
    }
}

public class Over1 {
    public static void main(String[] args) {
        Text t = new Text();
        t.getdata(10, 20);
        t.getdata(34.34, 23.45);
    }

}
