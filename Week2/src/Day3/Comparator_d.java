package Day3;

import java.util.ArrayList;
import java.util.List;

class Student1 {
	int id;
	String name;
	Student1(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return id + " " + name;
	}
}

public class Comparator_d {

	public static void main(String[] args) {
		List<Student1> list = new ArrayList<>();
		list.add(new Student1(3, "Amit"));
		
		list.add(new Student1(1, "Rahul"));
		list.add(new Student1(2, "Kiran"));
		
		list.sort((s1, s2) -> s1.name.compareTo(s2.name));
		// use comparator
		
		list.forEach(System.out::println);


	}

}
