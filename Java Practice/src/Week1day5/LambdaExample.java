package Week1day5;

//interface Greeting
//{
//	void sayHello();
//}
//
//public class LambdaExample {
//
//	public static void main(String[] args) {
//		Greeting greeting = ()->System.out.println("Hello");
//		greeting.sayHello();
//	}
//
//}

					//		Example 2

interface Even
{
	boolean isEven(int num);
}

public class LambdaExample {

	public static void main(String[] args) {
		Even check = (num)->num%2==0;
		System.out.println(check.isEven(-2));
	}

}



						//Wrapper class Example

//import java.util.function.Predicate;
//
//public class LambdaExample{
//	public static void main(String[] args) {
//		Predicate<Integer> isEven = num->num%2==0;
//		System.out.println(isEven.test(7));
//	}
//}
