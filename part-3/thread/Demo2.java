// WAP to create 2 thread one thread will print accending no. 
//where as second thread print desending no. 1 to 15.

class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 15; i++) {

            System.out.println(i);
        }
    }
}

class Mythread2 extends Thread {
    public void run() {
        for (int i = 15; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

public class Demo2 {
    public static void main(String[] args) {
        MyThread1 a = new MyThread1();
        Mythread2 b = new Mythread2();
        a.start();

        b.start();
    }
}
