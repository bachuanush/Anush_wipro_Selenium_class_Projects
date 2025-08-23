package Week1day6;

								//Example 1

//public class Exception {
//	public static void main(String[] args) {
//		System.out.println(1);
//		System.out.println(2);
//		try {
//			System.out.println(3/0);
//		}
//		catch (ArithmeticException e)
//		{
//			System.out.println(e);
//		}
//		System.out.println(4);
//		System.out.println(5);
//		
//	}
//}


								//Example 2

public class Exception {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			int[] a=new int[4];
			System.out.println(a[6]); //ArrayIndexOutOfBoundException
			
			System.out.println(5/0); //ArithmeticException
		
			String string = "Hello";
			System.out.println(string.charAt(6)); //StringIndexOutOfBoundException
			
		}
		
		//Instead of seperate catch for every Exception we use directly
//		catch (Exception e) {
//			System.out.println(e);
//		}
		
		
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		System.out.println(4);
		System.out.println(5);
		
	}
}
