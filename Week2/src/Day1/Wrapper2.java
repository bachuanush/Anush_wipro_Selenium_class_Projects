package Day1;

import java.util.concurrent.CountDownLatch;

//Example 1

//public class Wrapper2 {
//
//	public static void main(String[] args) {
//	char a = '6';
//		System.out.println(Character.isDigit(a));
//		
//
//	}
//
//}

					//Example 2

//public class Wrapper2 {
//
//	public static void main(String[] args) {
//		
//		String ab = "A5DE69G24";
//		char[] bc = ab.toCharArray();
//		
//		for(int i=0; i<bc.length; i++) {
//			if(Character.isDigit(bc[i])) {
//				System.out.println("It is a digit");
//			}
//			else {
//				System.out.println("It is a character");
//			}
//		}
//
//
//	}
//
//}


					//Example 3

public class Wrapper2 {

	public static void main(String[] args) {
		
		String ab = "A5DE69G24";
		char[] bc = ab.toCharArray();
		
		int Intcount = 0;
		int Strcount = 0;
		
		for(int i=0; i<bc.length; i++) {
			if(Character.isDigit(bc[i])) {
				Intcount++;
			}
			else {
				Strcount++;
			}
		}
		System.out.println("Integer Count = " + Intcount );
		System.out.println("Character count = " + Strcount);


	}

}

