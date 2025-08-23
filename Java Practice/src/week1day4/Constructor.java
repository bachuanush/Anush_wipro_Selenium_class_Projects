package week1day4;


//Constructor name should be same as class name
//contructor loading is using with same constructor with diff arguments

public class Constructor{
	Constructor(){             //No argument
		System.out.println("Default constructor");
	}
	Constructor(int id, String name){                 //paramterized constructor
		System.out.println("Id is : " + id);
		System.out.println("name is : " + name);
	}
	Constructor(String name, int id){                 //paramterized constructor
		System.out.println("name is : " + name);
		System.out.println("Id is : " + id);
	}
	Constructor(int id, String name, float salary){    //paramterized constructor
		System.out.println("Id is : " + id);
		System.out.println("name is : " + name);
		System.out.println("salary is : " + salary);
	}
	
	public static void main(String[] args) {
		Constructor emp = new Constructor(2, "Niva");
	}
}
