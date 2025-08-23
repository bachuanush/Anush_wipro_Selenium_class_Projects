package control_statement_practice;

//public class Loop {
//	public static void main(String[] args) {
//		int age = 10;
//		if(age>=18) {
//			System.out.println("Eligible for Voting");
//	}
//	else
//	{
//		System.out.println("Not Eligible for Voting");
//	}
//	System.out.println("End program");
//}
//
//}


//public class Loop {
//	public static void main(String[] args) {
//		int age = 20;
//		int wt =20;
//		if(age>=18 && wt>=30) {
//			System.out.println("Eligible for Blood Donation");
//	}
//	else
//	{
//		System.out.println("Not Eligible for Blod Donation");
//	}
//}
//
//}


//public class Loop {
//	public static void main(String[] args) {
//		int money = 3000;
//		boolean hasleave=true;
//		if(money>5000 && hasleave) {
//			System.out.println("you can go on the trip");
//		}
//		else
//		{
//			System.out.println("you cannot go on thr trip");
//		}
//
//	}
//}


//public class Loop {
//	public static void main(String[] args) {
//		char ch = 'U';02   
//		if(ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' ||
//				ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
//		{
//			System.out.println(ch + " is Vowel");
//		}
//		else
//		{
//			System.out.println(ch+" is consonant");
//		}
//	}
//}

//public class Loop {
//	public static void main(String[] args) {
//		String day = "monday";
//		if(day == "monday" ||day=="tuesday" ||day=="wednesday" ||day=="thursday" ||day=="friday")
//		{
//			System.out.println(day + " is weekday");
//		}
//		else
//		{
//			System.out.println(day + " is weekend");
//		}
//	}
//}


//public class Loop {
//	public static void main(String[] args) {
//		int marks = 75;
//		boolean reserved = true;
//		if(marks >= 80 || reserved)
//		{
//			System.out.println("Eligible for Scholarship");
//		}
//		else
//		{
//			System.out.println("Not eligle for the Scholarshop");
//		}
//	}
//}


public class Loop {
	public static void main(String[] args) {
		int tem = 36;
		if(tem > 40)
		{
			System.out.println("very hot");
		}
		else if(tem >= 30 && tem <= 40)
		{
			System.out.println("Hot");
		}
		else if(tem >= 20 && tem <= 29)
		{
			System.out.println("warm");
		}
		else if(tem >= 10 && tem <= 19)
		{
			System.out.println("cool");
		}
		else {
			System.out.println("very cool");
		}
	}
}