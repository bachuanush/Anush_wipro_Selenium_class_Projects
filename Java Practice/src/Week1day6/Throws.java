package Week1day6;



//public class Throws {
//	void add(int a, int b)
//	
//	{
//		int sum=a+b;
//		System.out.println("Addition="+sum);
//	}
//void div(int a, int b) throws ArithmeticException
//	
//	{
//		int div=a/b;
//		System.out.println("Division="+div);
//	}
//
//
//public static void main(String[] args) {
//	Throws s = new Throws();
//	s.add(10,20);
//	s.div(100,0);
//}
//
//}



								//Example 2
 
 
 public class Throws {

	public static void main(String[] args) {
		String name=null;
		 if (name==null)
		 {
			 throw new NullPointerException("Name is not null");
		 }
		 System.out.println(name.length());
	}
}