package week1day4;


//There 5 types of inheritance, but only we use 3 types in java
//single inheritance
//Multilevel inheritance
//Hierarchy inheritance, only one parent and multiple child class.


												//Multilevel inheritance Example



//
//class Animal1// parent
//{
//	void eat(String eats)
//	{
//		System.out.println("Eats="+eats);
//	}
//	void sound(String sd)
//	{
//		System.out.println("Sound="+sd);
//	}
//}
//class Dog extends Animal1//child
//{
//	void lives(String lives)
//	{
//		System.out.println("Lives in the "+lives);
//	}
//}
//class Puppy extends Dog//subchild
//{
//	void breed(String bd)
//	{
//		System.out.println("Breed of Dog is "+bd);
//	}
//}
// 
//public class Typesofinheritance {
// 
//	public static void main(String[] args) {
//		Puppy max=new Puppy();
//		max.eat("Royal canin");
//		max.sound("barking");
//		max.lives("city");
//		max.breed("Lab");
// 
//	}
// 
//}
// 
 


										//Multilevel inheritance Example done by me

class Vechile{
	void type() {
		System.out.println("The vechile type is a Four_Wheerler");
	}
}

class Four_wheelr extends Vechile{
	void type1() {
		System.out.println("Petrol_Four_Wheeler");
	}
}

class FiveSeater_Petrol_Four_Wheeler extends Four_wheelr{
	void type2() {
		System.out.println("Baleno_FiveSeater_Petrol_Four_Wheeler");
	}
}

public  class Typesofinheritance{
	public static void main(String[] args) {
FiveSeater_Petrol_Four_Wheeler obj = new FiveSeater_Petrol_Four_Wheeler();
obj.type();
	}
}