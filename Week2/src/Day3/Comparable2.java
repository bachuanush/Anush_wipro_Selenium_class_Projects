package Day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable2 implements Comparable<Comparable2> {
	int id;
	String name;
	
	Comparable2(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int compareTo(Comparable2 s) {
		return this.name.compareTo(s.name);
		//for comparing STring(Sorting String)
	}
	
	public String toString() {
		return id + " " + name;
	}

	public static void main(String[] args) {
		List<Comparable2> list = new ArrayList<>();
		list.add(new Comparable2(9, "Amit"));
		list.add(new Comparable2(5,"Bharat"));
		list.add(new Comparable2(9, "Chetak"));
		
		Collections.sort(list);  //Uses Comparable
		
		list.forEach(System.out::println);
		
				

	}

}