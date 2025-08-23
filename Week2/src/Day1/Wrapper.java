package Day1;


public class Wrapper {
	public static void main(String[] args) {
		//Autoboxing (Convert Primitive to wrapper classes)
		int num=10;
		System.out.println("Primitive type of data = " + num);//Memory allocation 4 bytes
		Integer num1 = num;
		System.out.println("Wrap data = " + num1);
		
		//Unboxing (Convert wrapper classes to Primitive)
				Integer a = 20;
				System.out.println("for object = " + a);
				int b=a; //Unboxing(object to primitive)
				System.out.println("for primitive data type in ="+ b);
		
				String str = "12345";
				int ab = Integer.parseInt(str);
				System.out.println(ab);
				
				String n = Integer.toString(num);
				System.out.println(n);
	}
}
