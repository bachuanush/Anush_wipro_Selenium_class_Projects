package Day2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_hash_set {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Maggi");
		set.add("Pasta");
		set.add("Salt");
		set.add("Chocolate");
		set.add("Wate");
		set.add("Water");
		set.add(null);
		set.add(null);
		System.out.println(set);
		
		
        System.out.println(set);
		
		System.out.println(set.clone());
		System.out.println(set.contains("Psta"));
		set.remove("Water");
		System.out.println(set);
		
		set.add("Oil");
		System.out.println(set);
		set.clear();
		System.out.println(set);
		
		System.out.println(set.isEmpty());
		
		System.out.println(set.getFirst());
		System.out.println(set.getLast());
		
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
