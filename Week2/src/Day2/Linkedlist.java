package Day2;

//Indexed access(get elements only index)
//Allows duplicates
//maintains insertion order
//supports null elements
//Faster than ArrayList
//Allocate more memory as compare to ArrayList (store data(current) and Pointers for next)


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
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
