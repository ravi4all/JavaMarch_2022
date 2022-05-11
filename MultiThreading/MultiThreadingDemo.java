package MultiThreading;

// class ThreadDemo extends Thread {
//     public void run() {
//         int x = 0;
//         System.out.println("Running : " + Thread.currentThread().getName());
//         for(int i = 0; i < 10; i++) {
//             x += i;
//         }
//     }
// }

class ThreadDemo implements Runnable {
    public void run() {
        int x = 0;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Running : " + Thread.currentThread().getName());
        for(int i = 0; i < 10; i++) {
            x += i;
        }
        System.out.println("State : " + Thread.currentThread().getState());
    }
}

public class MultiThreadingDemo {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++) {
            // ThreadDemo thread = new ThreadDemo();
            // thread.start();

            ThreadDemo obj = new ThreadDemo();
            Thread th = new Thread(obj, "Thread_"+i);
            System.out.println(th.getState());
            th.start();
            // System.out.println(th.getState());
        }
    }
}
