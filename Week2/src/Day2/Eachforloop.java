package Day2;

import java.util.ArrayList;
import java.util.*;

public class Eachforloop {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add(0, "Apple");
		list.add(1, "Mango");
		list.add(2, "Kiwi");
		list.add(3, "Banana");
		
//		System.out.println(list);
		
//		for(String ch:list)
//		{
//			System.out.println(ch);
//		}
		
		//Using Iterator
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		//Using ListIterator
		Iterator<String> itrs = list.listIterator();
		while (itrs.hasNext()) {
			System.out.println(itrs.next());
		}
		
	}

}
