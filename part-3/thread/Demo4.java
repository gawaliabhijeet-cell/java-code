// WAP to create 2 thread one thread print even no. from 1 to 50.
// and another thread odd no. it will 1 to 50.

class even extends Thread {
    public void run() {
        for (int i = 0; i <= 50; i = i + 2) {

            System.out.println(i);
        }
    }
}

class odd extends Thread {
    public void run() {
        for (int i = 1; i < 50; i = i + 2) {
            System.out.println(i);
        }
    }
}

public class Demo4 {
    public static void main(String[] args) {
        even a = new even();
        odd b = new odd();
        a.start();
        b.start();
    }

}
