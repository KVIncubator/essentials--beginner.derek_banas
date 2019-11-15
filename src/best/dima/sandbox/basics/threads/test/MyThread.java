package best.dima.sandbox.basics.threads.test;

public class MyThread implements Runnable {
    @Override
    public void run() {
        // Print number of active threads
        System.out.println("Active Threads : " +
                Thread.activeCount());


        System.out.println("Start Thread : " +
                Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("End Thread : " +
                Thread.currentThread().getName());
    }
}
