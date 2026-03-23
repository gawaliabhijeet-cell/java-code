class MyThread implements Runnable {
    public void run() {
        System.out.println("child thread");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        MyThread a = new MyThread();
        Thread a1 = new Thread(a);
        a1.start();
    }
}
