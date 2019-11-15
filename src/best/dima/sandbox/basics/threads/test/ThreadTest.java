package best.dima.sandbox.basics.threads.test;

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