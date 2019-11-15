package best.dima.sandbox.languagebasics.threads.test;

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
