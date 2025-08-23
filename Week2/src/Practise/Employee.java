package Practise;

import java.io.Serializable;

public class Employee implements Serializable {
	int id;
	String name;
	
	Employee(int id, String name)
	{
		this.id=id;
		this.name=name;
	}

	void display()
	{
		System.out.println("ID :  " + id + ", Name: " + name);
	}
}
