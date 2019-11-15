package best.dima.sandbox.lang.basics.threads;

import best.dima.sandbox.lang.basics.threads.test.Customer;
import best.dima.sandbox.lang.basics.threads.test.MyThread;
import best.dima.sandbox.lang.basics.threads.test.ThreadTest;

public class Threads {

    // ---- THREADS ----
    // A thread is a block of code that is expected
    // to execute while other blocks of code execute
    public void run() {
        System.out.printf("\n### %s\n", Threads.class.getSimpleName());

        // Using threads using a class that implements
        // the Runnable interface
        // Create a Thread
        Thread t1 = new Thread(new MyThread(),
                "Thread 1");
        Thread t2 = new Thread(new MyThread(),
                "Thread 2");
        Thread t3 = new Thread(new MyThread(),
                "Thread 3");

		/*
		t1.start();
		t2.start();
		t3.start();
		*/

        // Have the 3rd thread wait for the 1st
        // to finish with join
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();


        ThreadTest tT1 = new ThreadTest(new Customer("Sam"));
        tT1.start();
        ThreadTest tT2 = new ThreadTest(new Customer("Sue"));
        tT2.start();
        ThreadTest tT3 = new ThreadTest(new Customer("Sid"));
        tT3.start();

    }
}
