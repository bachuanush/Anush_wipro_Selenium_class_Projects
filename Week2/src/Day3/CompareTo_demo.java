package Day3;

import java.util.*;

//Comparable Interface

public class CompareTo_demo  implements Comparable<CompareTo_demo>{
	int id;
	String name;
	
	CompareTo_demo(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int CompareTo(CompareTo_demo s) {
		return id - s.id;
	}
	
	public String toString(CompareTo_demo s) {
		return id +" " + name;
	}
	
	public static void main(String[] args) {
		List<CompareTo_demo> list = Arrays.asList(
				new CompareTo_demo(9, "Amit"),
				new CompareTo_demo(0, "Rahul"),
				new CompareTo_demo(2, "Kiran")		
				);

		Collections.sort(list);  //Uses Comparable
		
		list.forEach(System.out::println);
	}

}
