class MyTask extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " is running: " + i);
            try {
                Thread.sleep(1000); // 1-second delay
            } catch (InterruptedException e) {
                System.out.println("Interrupted: " + e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyTask t1 = new MyTask();
        MyTask t2 = new MyTask();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();

        try {
            t1.join();  // Wait until Thread-1 completes
            t2.join();  // Wait until Thread-2 completes
        } catch (InterruptedException e) {
            System.out.println("Join interrupted: " + e);
        }

        System.out.println("All threads finished.");
    }
}
