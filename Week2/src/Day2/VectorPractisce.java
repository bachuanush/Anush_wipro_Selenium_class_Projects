
package Day2;

//Array has fixed memory
//Vector has a dynamic memory allocation



import java.util.*;

public class VectorPractisce {
	public static void main(String[] args) {
		
		Vector<String> v=new Vector<String>();
		v.add("Orange");
		v.add("Blue");
		v.add("White");
		v.add("Black");
		v.add(4, "Gray");
		v.add(null);
		v.add("Black");
		
		System.out.println(v);
		
		System.out.println(v.indexOf("Black"));
		System.out.println(v.subList(0, 3));
		
		
		System.out.println(v.get(3));
		
		v.set(2, "Orange"); //replace current element
		System.out.println(v);
		
		v.add(3, "Kiwi"); //add element on particular index
		System.out.println(v);
		
		System.out.println(v.contains("Banana"));
		System.out.println(v.equals("Banana"));
		System.out.println(v.getFirst());
		System.out.println(v.getLast());
		System.out.println(v.indexOf("Kiwi"));
		System.out.println(v.isEmpty());
		
		v.remove(0);
		System.out.println(v);
		
		v.remove("Kiwi");
		System.out.println(v);
		System.out.println(v.reversed());

	}

}
