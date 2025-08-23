package Day2;

import java.util.*;
//Merge two ArrayList and remove duplicates.

public class Practice3 {

	public static void main(String[] args) {
		ArrayList<String> ab = new ArrayList<>();
		ab.add("Grappes");
		ab.add("Mango");
		ab.add("Banana");
		
		
		ArrayList<String> bc = new ArrayList<>();
		bc.add("Apple");
		bc.add("Banana");
		bc.add("Kiwi");

		List<String> mergedList = new ArrayList<>();
		
		for (String item : ab) {
            if (!mergedList.contains(item)) {
                mergedList.add(item);
            }
        }


        for (String item : bc) {
            if (!mergedList.contains(item)) {
                mergedList.add(item);
            }
        }
		
		System.out.println("Merged List without duplicates: " + mergedList);

	}

}
