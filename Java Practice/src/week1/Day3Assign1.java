package week1;

				// Count the number of Vowels in the String

//public class Day3Assign1 {
//	public static void main(String[] args) {
//		String str = "Programming";
//		int count = 0;
//		str = str.toLowerCase(); // Convert to Lower Case
//		
//		for(int i=0; i<str.length(); i++) {
//			char ch = str.charAt(i);
//		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
//			count++;
//		}
//		}
//		
//		{
//			System.out.print("count is : " + count);
//		}
//		
//	}
//}




													//Variables 


								//2. Create addition of two numbers using variables


//import java.util.Scanner;


//public class Day3Assign1{
//  public static void main(String[] args){
//      Scanner sc = new Scanner(System.in);
     
//      System.out.print("Enter the value of a : ");
//      int a = sc.nextInt();
     
//      System.out.print("Enetr the value of b : ");
//      int b = sc.nextInt();
     
//      int c = a + b;
     
//      System.out.println("Addition of two numbers : " + c);
     
//      sc.close;
//  }
//}








								//3. Swap two numbers using third variable 


//import java.util.Scanner;


//public class Day3Assign1{
//  public static void main(String[] args){
//      Scanner sc = new Scanner(System.in);
     
//      System.out.print("Enter the value of a : ");
//      int a = sc.nextInt();
     
//      System.out.print("Enter the value of b : ");
//      int b = sc.nextInt();
     
//      int c = a;
//      a = b;
//      b = c;
     
//      System.out.print("Value of a after swapping is : " + a + " Value of b after swapping is : " + b);
//  }
//}








											//4. Calculate area of rectangle 


//import java.util.Scanner;


//public class Day3Assign1{
//  public static void main(String[] args){
//      Scanner sc = new Scanner(System.in);
     
//      System.out.print("Enter the value of length : ");
//      int length = sc.nextInt();
     
//      System.out.print("Enter the value of breadth : ");
//      int breadth = sc.nextInt();
     
//      int AreaOfRectangle = length * breadth;
     
//      System.out.print("The Area of Rectangle is : " + AreaOfRectangle);
//  }
//}






													//5. Calculate simple interest 


//import java.util.Scanner;


//public class Day3Assign1{
//  public static void main(String[] args){
//      Scanner sc = new Scanner(System.in);
     
//      System.out.print("Enter the Principle Amount : ");
//      int p = sc.nextInt();
     
//      System.out.print("Enter the Term(in Years) value : ");
//      int t = sc.nextInt();
     
//      System.out.print("Enter the Rate of Interest (per annum, %) : ");
//      double r = sc.nextDouble();
     
//      double Si = (p*t*r)/100;
     
//      System.out.println("The Simple Interest is : " + Si);
//  }
//}




																//String


							//// 1. Count number of vowels in a string(input=”Programming”, output=3 Vowels) 




//public class Day3Assign1{
//  public static void main(String[] args){
//      String a = "Programming";
//      a=a.toLowerCase();
     
//      int count = 0;
     
//      for(int i=0; i<a.length(); i++){
//          if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u'){
//              count++;
//          }
//      }
//      System.out.print("The count of vowels is : " + count);
//  }
//}






									//// 2. Replace all Spaces with Hyphens


//public class Day3Assign1{
//  public static void main(String[] args){
//      String a = ("Computer programming is a great subject, which was included this year");
     
//      String b = a.replace(' ', '-');
//      System.out.println(b);
//  }
//}






									//3. Check if a string is Palindrome 


//public class Day3Assign1{
//  public static void main(String[] args){
//      String a = "Markram";
//      a=a.toLowerCase();
     
//      String b = "";
     
//      for(int i=a.length()-1; i>=0; i--){
//          b+=a.charAt(i);
//      }
     
//      System.out.println("String b : " + b);
     
//      if(a.equals(b)){
//          System.out.println("It is palindrome");
//      }
//      else{
//          System.out.println("It is not a Palindrome");
//      }
//  }   
//}






										//4. Count words in a Sentence


//public class Day3Assign1{
//  public static void main(String[] args){
//      String a="Computer is a great language to learn";
     
//      String[] b=a.trim().split("\\s+");
     
//      System.out.println("The count of words in a sentence is :" + b.length);
//  }
//}










							//5. Check if String  starts with “j” and end with “a” . eg. “java” 


//public class Day3Assign1{
//  public static void main(String[] args){
//      String a = "Java";
//      boolean b = a.startsWith("J");
     
//      System.out.println(b);
//  }
//}




													//Array


								//1. Write a program to find the sum of all elements in an integer array 




//public class Day3Assign1
//{
//	public static void main(String[] args) {
//	    int[] a = {2, 6, 85, 26, 96};
//	    int b= 0;
	    
//	    for(int i=0; i<a.length; i++){
//	        b += a[i];
//	    }
	    
//	    System.out.println("The sum of all elements in an Array is : " + b);
//	}
//}




						//6. write a program to print an array in reverse order


//public class Day3Assign1{
//  public static void main(String[] args){
//      int[] a = {25, 21, 85, 36, 98};
     
     
//      for(int i = a.length-1; i >=0; i--){
//          System.out.println(a[i]);
//      }
//  }
//}






						//7. Sort an array in ascending order


//import java.util.Arrays;


//public class Day3Assign1{
//  public static void main(String[] args){
//      int[] a = {25, 21, 85, 36, 98};
     
//      Arrays.sort(a);
     
//      for(int i = 0; i<a.length; i++){
//          System.out.println(a[i]);
//      }
//  }
//}


