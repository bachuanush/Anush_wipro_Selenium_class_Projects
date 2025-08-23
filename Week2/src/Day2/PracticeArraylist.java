package Day2;


import java.util.*;


//Create ArrayList and search for an element

public class PracticeArraylist {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(2);
		a1.add(6);
		a1.add(3);
		a1.add(51);
		
		System.out.println(a1);
		
		if(a1.contains(4)) {
			System.out.println("Found!");
		}
		else {
			System.out.println("Not Found");
		}
	}
}
