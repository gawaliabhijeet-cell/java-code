class MyThread extends Thread {
    public void run() {
        System.out.println("child thread");
    }
}

public class Demo {
    public static void main(String[] args) {
        MyThread a = new MyThread();
        a.start();
        System.out.println("thread");
    }

}
