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

public class BankAccount {
    static BankAccount account;
    static int balance = 100;
    static Customer cust;

    // This is how you set up a singleton
    // where there is only one BankAccount
    public static BankAccount getAccount(Customer cust) {
        if(account == null) {
            account = new BankAccount();
        }
        BankAccount.cust = cust;
        return account;
    }

    public static int getBalance() {
        return balance;
    }

    // By marking as synchronized only one
    // thread can execute at a time
    public synchronized void withdraw(int bal) {
        try {
            if (balance >= bal) {
                System.out.println(cust.name +
                        " requested $" + bal);
                Thread.sleep(1000);
                balance -= bal;
                System.out.println(cust.name +
                        " received $" + bal);
            } else {
                System.out.println(cust.name +
                        " tried to exceed balance");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("Current Balance : $" +
                balance);
        System.out.println();
    }
}
