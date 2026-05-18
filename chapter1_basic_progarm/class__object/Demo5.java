// WAP to calculate the grows salary of 3 employees 
// if vasic salary,da,hra are given.
//note da is 45% and hra is 62% an basic salary.

import java.util.*;

class Employee {
    double basic, da, hra, gs;
    Scanner sc = new Scanner(System.in);

    void getdata() {
        System.out.println("Enter basic salary:");
        basic = sc.nextDouble();
    }

    void calculate() {
        da = 0.45 * basic;
        hra = 0.62 * basic;
        gs = basic + da + hra;
    }

    void putdata() {
        System.out.println("Gross salary is: " + gs);
    }
}

class Demo5 {
    public static void main(String args[]) {

        Employee e[] = new Employee[3]; // ✅ size given
        int i;
        for (i = 0; i < 3; i++) {

            e[i] = new Employee();

        }
        for (i = 0; i < 3; i++) {
            e[i].getdata();
        }
        for (i = 0; i < 3; i++) {
            e[i].calculate();
        }
        for (i = 0; i < 3; i++) {
            e[i].putdata();
        }
    }
}
