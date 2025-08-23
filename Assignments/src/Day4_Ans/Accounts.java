package Day4_Ans;

interface Bank1 {
 void deposit(double amt);
 void withdraw(double amt);
 double getBalance();
}

abstract class Account implements Bank1 {
 protected double balance;

 public Account(double initialBalance) {
     this.balance = initialBalance;
 }

 @Override
 public void deposit(double amt) {
     if (amt > 0) {
         balance += amt;
         System.out.println("deposited: " + amt);
     } else {
         System.out.println("invalid deposit amount.");
     }
 }

 @Override
 public double getBalance() {
     return balance;
 }
}

class SavingsAccount extends Account {
 private static final double MIN_BALANCE = 1000;

 public SavingsAccount(double initialBalance) {
     super(initialBalance);
 }

 @Override
 public void withdraw(double amt) {
     if (amt > 0 && (balance - amt) >= MIN_BALANCE) {
         balance -= amt;
         System.out.println("withdrawl: " + amt);
     } else {
         System.out.println("withdrawal failed. minimum balance of " + MIN_BALANCE + " must maintained.");
     }
 }
}

class CurrentAccount extends Account {
 private static final double OVER_LIMIT = 5000;

 public CurrentAccount(double initialBalance) {
     super(initialBalance);
 }

 @Override
 public void withdraw(double amt) {
     if (amt > 0 && (balance - amt) >= -OVER_LIMIT) {
         balance -= amt;
         System.out.println("withdrawl: " + amt);
     } else {
         System.out.println("withdrawal failed. over limit " + OVER_LIMIT + " exceeded.");
     }
 }
}

public class Accounts {
 public static void main(String[] args) {
     Bank1 savings = new SavingsAccount(5000);
     Bank1 current = new CurrentAccount(2000);

     System.out.println("***********savings account*******");
     savings.deposit(2000);
     savings.withdraw(5500);
     System.out.println("balance: " + savings.getBalance());

     System.out.println("**********current account **********");
     current.deposit(1000);
     current.withdraw(3500);
     current.withdraw(6000); 
     System.out.println("balance: " + current.getBalance());
 }
}
