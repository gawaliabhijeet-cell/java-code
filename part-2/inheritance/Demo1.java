interface Allowance {
    void netsalary();
}

class Salary implements Allowance {
    int empid;
    String name;
    double bs;

    Salary(int e, String n, double b) {
        empid = e;
        name = n;
        bs = b;
    }

    public void netsalary() {

        double da = 0.90 * bs;
        double hra = 0.10 * bs;
        double pf = 0.0833 * bs;

        double ns = bs + da + hra - pf;

        System.out.println("Empid: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + bs);
        System.out.println("Net Salary: " + ns);
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Salary s = new Salary(11, "abhi", 3000);
        s.netsalary();
    }
}
