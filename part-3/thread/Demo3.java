// WAP to create  2 thread 1 thread print no.1 to 10 and
// another thread will print no. between 11 to 20.

class Abhi extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {

            System.out.println(i);
        }
    }
}

class Abhijeet extends Thread {
    public void run() {
        for (int i = 11; i <= 20; i++) {

            System.out.println(i);
        }
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Abhi a = new Abhi();
        Abhijeet b = new Abhijeet();
        a.start();
        b.start();
    }
}
