package MultiThreading;

class ThreadPriority extends Thread {
    @Override
    public void run() {
        System.out.println("Inside Run Method...");
    }
}

public class PriorityDemo {
    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();
        ThreadPriority t3 = new ThreadPriority();
        ThreadPriority t4 = new ThreadPriority();

        System.out.println("Thread T1 Priority is : " + t1.getPriority());
        System.out.println("Thread T2 Priority is : " + t2.getPriority());
        System.out.println("Thread T3 Priority is : " + t3.getPriority());
        System.out.println("Thread T4 Priority is : " + t4.getPriority());

        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);
        t4.setPriority(1);

        System.out.println("Updated Priorities...");

        System.out.println("Thread T1 Priority is : " + t1.getPriority());
        System.out.println("Thread T2 Priority is : " + t2.getPriority());
        System.out.println("Thread T3 Priority is : " + t3.getPriority());
        System.out.println("Thread T4 Priority is : " + t4.getPriority());

        System.out.println("Currently Running Thread : " + Thread.currentThread().getName());
        System.out.println("Main Priority : " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Main Priority : " + Thread.currentThread().getPriority());
    }
}
