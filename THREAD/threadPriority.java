class MyPriorityThread extends Thread {
    public void run() {
        System.out.println(getName() + " with priority " + getPriority() + " is running.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyPriorityThread t1 = new MyPriorityThread();
        MyPriorityThread t2 = new MyPriorityThread();
        MyPriorityThread t3 = new MyPriorityThread();

        t1.setName("LowPriorityThread");
        t2.setName("HighPriorityThread");
        t3.setName("NormalPriorityThread");

        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.MAX_PRIORITY);   // 10
        t3.setPriority(Thread.NORM_PRIORITY);  // 5

        t1.start();
        t2.start();
        t3.start();
    }
}
