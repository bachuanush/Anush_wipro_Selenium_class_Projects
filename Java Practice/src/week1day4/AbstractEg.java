package week1day4;

//abstract class Animal1
//{
//	void eat()
//	{
//		System.out.println("Eating");
//	}
//	abstract void sound();
//}
//class Dog1 extends Animal1
//{
//	void sound()
//	{
//		System.out.println("Sound=Barking");
//	}
//}
//class Tiger1 extends Animal1{
//	void sound()
//	{
//		System.out.println("Sound=Roarrr");
//	}
//}
//
//public class AbstractEg {
//
//	public static void main(String[] args) {
//		System.out.println("**********Dog**********");
//		Dog1 maxDog=new Dog1();
//		maxDog.eat();
//		maxDog.sound();
//		System.out.println("*********Tiger********");
//		Tiger1 shera=new Tiger1();
//		shera.eat();
//
//	}
//
//}


								//Example2


abstract class Vehicle
{
	abstract void no_of_tyre();
	abstract void no_of_seats();
	abstract void run_on();
	void start_stop()
	{
		System.out.println("Vehicle start on fuel and stop with button");
	}
}

class Car extends Vehicle
{
	void no_of_tyre()
	{
		System.out.println("4 wheels");
	}
	void no_of_seats()
	{
		System.out.println("5 or 7 seats");
	}
	void run_on()
	{
		System.out.println("Car run on Petrol or Diseal");
	}
}

public class AbstractEg{
	public static void main(String[] args) {
		System.out.println("**********Car*******");
		Car b = new Car();
		b.no_of_tyre();
		b.no_of_seats();
		
	}
}