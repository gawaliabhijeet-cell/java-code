
public class Command {

    public static void main(String[] args) {
        int a, b, c, t, avg;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        t = a + b + c;
        avg = t / 3;
        System.out.println("Total is:" + t);
        System.out.println("Average is:" + avg);
    }

}
