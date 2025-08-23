package Day2;

import java.util.ArrayList;
import java.util.LinkedList;

//8. Convert Linkedlist to ArrayList
//Write a program to:
//. Create a LinkedList of Strings.
//. Convert it into an ArrayList.
//. Display both the LinkedList and ArrayList.



public class LinktoArray {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<>();
		l1.add("Rose");
		l1.add("Lilly");
		l1.add("Sunflower");
		
		System.out.println("Linked List : " + l1);
		
		ArrayList<String> l2 = new ArrayList<>(l1);
		
		System.out.println("Array List : " + l2);
		

	}

}
