// public final String getName()
// public final void setName(String Name)

class MyThread extends Thread {
    public void run() {
        Thread.currentThread().setName("child class");
        System.out.println("run method is executed by=" + Thread.currentThread().getName());
    }
}

public class Demo5 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        System.out.println("main method is excuted by=" + Thread.currentThread().getName());
    }
}
