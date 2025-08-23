package Day2;

import java.util.*;


//Indexed access(get elements only index)
//Allows duplicates
//maintains insertion order
//supports null elements



public class Arraylist {
	public  static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add(0, "Apple");
		list.add(1, "Mango");
		list.add(2, "Kiwi");
		list.add(3, "Banana");
		
		System.out.println(list);
		System.out.println(list.get(3));
		
		list.set(2, "Orange"); //replace current element
		System.out.println(list);
		
		list.add(3, "Kiwi"); //add element on particular index
		System.out.println(list);
		
		System.out.println(list.contains("Banana"));
		System.out.println(list.equals("Banana")); //.equals is used to check whether two lists are equal or not. Not a single Element.
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.indexOf("Kiwi"));
		System.out.println(list.isEmpty());
		
		list.remove(0);
		System.out.println(list);
		
		list.remove("Kiwi");
		System.out.println(list);
		System.out.println(list.reversed());
		
	}

}
