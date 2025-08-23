package Day4_Ans;


class Bank {
 double getInterestRate() {
     return 0.0; 
 }
}

class SBI extends Bank {
 @Override
 double getInterestRate() {
     return 6.7;
 }
}

class ICICI extends Bank {
 @Override
 double getInterestRate() {
     return 7.0;
 }
}

class HDFC extends Bank {
 @Override
 double getInterestRate() {
     return 7.5;
 }
}

public class Banks {
 public static void main(String[] args) {
     Bank sb = new SBI();
     Bank ic = new ICICI();
     Bank hd = new HDFC();

     System.out.println("SBI interest rate: " + sb.getInterestRate() + "%");
     System.out.println("ICICI interest rate: " + ic.getInterestRate() + "%");
     System.out.println("HDFC interest rate: " + hd.getInterestRate() + "%");
 }
}
