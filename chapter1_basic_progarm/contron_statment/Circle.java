
// public class Circle {
//     public static void main(String[] args) {
//         double r, a, p;
//         r = Double.parseDouble(args[0]);
//         a = 3.14 * r * r;
//         p = 2 * 3.14 * r;
//         System.out.println("Area of Circle is: " + a);
//         System.out.println("Perimeter of Circle is: " + p);
//     }
// }
class Circle {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Please provide the radius");
            return;
        }

        double r = Double.parseDouble(args[0]);
        double area = Math.PI * r * r;

        System.out.println("Area of Circle = " + area);
    }
}
