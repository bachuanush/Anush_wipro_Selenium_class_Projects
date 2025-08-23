package Day2;

//convert ArrayList to Array

import java.util.*;

public class Practice2 {

	public static void main(String[] args) {
		ArrayList<String> ab = new ArrayList<>();
		
		ab.add("Apple");
		ab.add("Banana");
		ab.add("Orange");

		String[] fruit = new String[ab.size()];
		fruit = ab.toArray(fruit);
		
		for(int i=0; i<fruit.length; i++) {
			System.out.println(fruit[i]);
		}
		

	}

}
