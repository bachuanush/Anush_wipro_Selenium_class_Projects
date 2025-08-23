package Day3;

import java.util.TreeMap;
import java.util.TreeSet;

//Null are not supported
//It stores values in increasing order or in Alphabetical order
//No duplicates are allowed
//Elements are stored based on the hash code value

public class Tree_Map {

	public static void main(String[] args) {
    TreeMap<Integer, String> set = new TreeMap<Integer, String>();
		
		set.put(1, "Maggi");
		set.put(2, "Pasta");
		set.put(3, "Salt");
		set.put(7, "Chocolate");
		set.put(5, "Water");
		set.put(9, "Water");
		set.put(4, "Yippi");
		
		System.out.println(set);
		System.out.println(set.clone());
		System.out.println(set.containsValue("Pasta"));
		
     	set.remove(2);
		System.out.println(set);
		
		System.out.println(set.ceilingKey(2)); //It will print highest element
		System.out.println(set.floorEntry(6));   //It will print least value
		System.out.println(set.higherKey(2));
		System.out.println(set.lowerKey(3));
		
		set.pollFirstEntry(); //Removes First element
		
		System.out.println(set);
		set.pollLastEntry();
		System.out.println(set);
		System.out.println(set.descendingKeySet());
		
	}
}
