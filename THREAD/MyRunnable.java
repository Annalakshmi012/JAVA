class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Runnable Thread Running - " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread is Interrupted: " + e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Runnable obj = new MyRunnable();
        Thread t1 = new Thread(obj);
        t1.setName("RunnableThread-1");
        t1.start();
    }
}
