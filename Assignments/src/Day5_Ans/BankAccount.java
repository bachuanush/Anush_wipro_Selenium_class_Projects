package Day5_Ans;

import java.util.*;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;
    private List<Transaction> transactions;

    private class Transaction {
        private String type; 
        private double amount;
        private double postBalance;

        public Transaction(String type, double amount, double postBalance) {
            this.type = type;
            this.amount = amount;
            this.postBalance = postBalance;
        }

        @Override
        public String toString() {
            return String.format("%s: %.2f, Balance after: %.2f", type, amount, postBalance);
        }
    }

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        transactions.add(new Transaction("Deposit", amount, balance));
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("withdraw amount must be positive.");
            return false;
        }
        if (amount > balance) {
            System.out.println("insufficient balance for withdrawal.");
            return false;
        }
        balance -= amount;
        transactions.add(new Transaction("Withdraw", amount, balance));
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public String getLastTransaction() {
        if (transactions.isEmpty()) {
            return "no transactions available.";
        }
        return transactions.get(transactions.size() - 1).toString();
    }

    @Override
    public String toString() {
        String maskedAccNum = "****" + accountNumber.substring(Math.max(0, accountNumber.length() - 4));
        return String.format("account Holder: %s\naccount Number: %s\nbalance: %.2f",
                accountHolder, maskedAccNum, balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("1234567890123456", "Anush Rao", 1000);
        System.out.println(acc);

        acc.deposit(500);
        System.out.println("after deposit: " + acc.getBalance());
        System.out.println("last transaction: " + acc.getLastTransaction());

        boolean success = acc.withdraw(2000);
        System.out.println("withdraw 2000 successful? " + success);
        System.out.println("balance: " + acc.getBalance());

        success = acc.withdraw(300); 
        System.out.println("withdraw 300 successful? " + success);
        System.out.println("balance: " + acc.getBalance());
        System.out.println("last transaction: " + acc.getLastTransaction());

        System.out.println(acc);
    }
}

