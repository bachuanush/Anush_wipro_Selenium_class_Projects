package week1day4;



									//Method overloading
//Compile time polymorphism is called Method overloading


//public class Polymorphism {
//	void details(int rollno)
//	{
//		System.out.println("Rollno="+rollno);
//	}
//	
//	void details(int rollno,String name)
//	{
//		System.out.println("Rollno="+rollno);
//		System.out.println("Name ="+name);
//	}
//	void details(String name,int rollno)
//	{
//		System.out.println("Name ="+name);
//		System.out.println("Rollno="+rollno);		
//	}
//	void details(int rollno,String name, float per)
//	{
//		System.out.println("Rollno="+rollno);
//		System.out.println("Name ="+name);
//		System.out.println("Percentage="+per);
//	}
//
//	public static void main(String[] args) {
//		Student stud=new Student();
//		System.out.println("***student  rollno********");
//		stud.details(101);
//		System.out.println("***student rollno and name********");
//		stud.details(102, "Neeva Sharma");
//		System.out.println("***student name and rollno********");
//		stud.details("Reeva Verma", 103);
//		System.out.println("***student rollno, name and percentage********");
//		stud.details(104, "Shiva Upadhyay", 89.9f);
//
//	}
//
//}










									//Method Overriding
//Runtime time polymorphism is called Method overriding.

class Animal {
	void eat() {
		System.out.println("Eatings");
	}
	void sound() {
		System.out.println("Sound");
	}
}

class Dog extends Animal{
//	void eat()
//	{
//		System.out.println("Eats=Royal canin");
//	}
	void sound()
	{
		System.out.println("Sound=Barking");
	}
}

class Tiger extends Animal{
	void eat()
	{
		System.out.println("Eats=Meat");
	}
	void sound()
	{
		System.out.println("Sound=Roarrr");
	}
}


public class Polymorphism {
	public static void main(String[] args) {
		System.out.println("******Dog******");
		Dog max = new Dog();
		max.eat();
		max.sound();
		
		System.out.println("******Dog******");
		Tiger sher = new Tiger();
		sher.eat();
		sher.sound();
	}
}
