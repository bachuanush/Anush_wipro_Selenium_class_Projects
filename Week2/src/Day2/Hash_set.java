package Day2;

//unordered
//No duplicate elements allowed
//store null(Only one null allowed)
//elements stored on the basis of hash code value

import java.util.HashSet;
import java.util.Iterator;

public class Hash_set {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Maggi");
		set.add("Pasta");
		set.add("Salt");
		set.add("Chocolate");
		set.add("Wate");
		set.add("Water");
		set.add(null);
		set.add(null);
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
		
		
		Iterator<String> itr = set.iterator()
;
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
