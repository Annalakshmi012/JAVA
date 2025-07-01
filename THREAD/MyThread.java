class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        }
    }
}

public class MyThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("MyThread-1");
        t1.start();
    }
}

