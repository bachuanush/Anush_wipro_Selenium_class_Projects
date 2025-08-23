package Day2;


import java.util.*;

public class Linkedlist2 {

	public static void main(String[] args) {
//		LinkedList<Integer> bc1 = new LinkedList<>(List.of(10,25,36,24,52));
		LinkedList<Integer> bc = new LinkedList<>();
		
		bc.add(10);
		bc.add(13);
		bc.add(15);
		bc.add(12);
		bc.add(41);
		bc.add(36);
		bc.add(20);
		
		Object ef= new LinkedList<Integer>();
		ef=bc.clone();

		
		System.out.println("Original LinkedList: " + bc);
		System.out.println("Cloned LinkedList: " + ef);

	}

}