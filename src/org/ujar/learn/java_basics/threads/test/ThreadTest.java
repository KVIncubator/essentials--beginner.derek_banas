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

package org.ujar.learn.java_basics.threads.test;

public class ThreadTest extends Thread implements Runnable {
    Customer cust;

    public ThreadTest(Customer cust) {
        this.cust = cust;
    }
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            try {
                BankAccount account = BankAccount.getAccount(cust);
                account.withdraw(10);
                Thread.sleep(1000);

            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}