package Day1;

public class Passbyref {
	
	String name = "ClassTest";
	void show(String name1)
	{
		name=name1;
		System.out.println(name);
	}

	public static void main(String[] args) {
		Passbyref obj = new Passbyref();
		
		System.out.println(obj.name); //call by value
		obj.show("MethodTest"); //call by reference
	}

}
