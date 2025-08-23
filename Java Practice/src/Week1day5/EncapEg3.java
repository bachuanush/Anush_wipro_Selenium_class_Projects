package Week1day5;

											//Example 3

//public class EncapEg3 {
//	private double balance = 0;
//	
//	public void deposite(double amt)
//	{
//		if(amt > 0) {
//			balance+=amt;
//			System.out.println("Deposited = " + amt);
//		}
//	}
//	
//	private void withdraw(double amt)
//	{
//		if(amt>0 && amt<=balance) {
//			balance-=amt;
//			System.out.println("Withdraw amount = " + amt);
//		}
//		else {
//			System.out.println("Invalid amount");
//		}
//	}
//	
//	private double getbalance() {
//		return balance;
//	}
//
//	public static void main(String[] args) {
//		EncapEg3 acc = new EncapEg3();
//		acc.deposite(5000);
//		acc.withdraw(3000);
//		System.out.println(acc.getbalance());
//
//	}
//
//}



								//Example 4
class Abc{
	protected String name = "Hello ";
	void method() {
		System.out.println("You are accessing the parent class");
	}
}

class Def extends Abc{
	void method() {
		System.out.println("Accessing the proteced string from the parent  " + name);
	}
}

public class EncapEg3{
	public static void main(String[] args) {
		Def oi = new Def();
		oi.method();
	}
}