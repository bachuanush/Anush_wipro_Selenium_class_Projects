package Day7_Ans;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        System.out.println(Thread.currentThread().getName() + " depositing: " + amount);
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " new balance: " + balance);
    }

    public synchronized void withdraw(double amount) {
        System.out.println(Thread.currentThread().getName() + " withdrawing: " + amount);
        if (amount <= balance) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " new balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient funds. Balance: " + balance);
        }
    }
}

class BankingTask implements Runnable {
    private BankAccount account;

    public BankingTask(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.deposit(200);
        account.withdraw(150);
        account.withdraw(100);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(500);

        Thread t1 = new Thread(new BankingTask(acc), "Thread-1");
        Thread t2 = new Thread(new BankingTask(acc), "Thread-2");

        t1.start();
        t2.start();
    }
}

