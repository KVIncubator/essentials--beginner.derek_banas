/*
 *     Copyright 2021 ujar Knowledge Base @ http://ujar.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ujar.beginner.derek_banas.learn.java_basics.threads;

import org.ujar.beginner.derek_banas.learn.java_basics.threads.test.Customer;
import org.ujar.beginner.derek_banas.learn.java_basics.threads.test.MyThread;
import org.ujar.beginner.derek_banas.learn.java_basics.threads.test.ThreadTest;

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
