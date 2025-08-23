package Day9;

import java.util.*;
class Student implements Comparable<Student> 
   {
	int id;
	String name;
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public int compareTo(Student s) 
	{
		return this.name.compareTo(s.name);
	}

	public String toString() 
	{
		return id + " " + name;
	}
	
	public static void main (String[] args) 
	{
		List<Student> list = Arrays.asList(
				new Student(6,"ajay"),
				new Student(2,"arun"),
				new Student(7,"arjun")
				);
		
		Collections.sort(list);
		list.forEach(System.out::println);
	}
	

}

