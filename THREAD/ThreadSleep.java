class MyHello extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(2000); // Sleep for 2 seconds (2000 ms)
            } catch (InterruptedException e) {
                System.out.println("Thread is Interrupted: " + e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyHello t1 = new MyHello();
        t1.start();
    }
}
