package Day2;

import java.util.ArrayList;
import java.util.*;
import java.util.Collections;

public class Arraylist2 {

	public static void main(String[] args) {
		//Add Group of Elements with List interface method "of"
		ArrayList<Integer> list = new ArrayList<>(List.of(10, 70, 60, 20, 40));
		Collections.sort(list);
		System.out.print(list);

	}

}
