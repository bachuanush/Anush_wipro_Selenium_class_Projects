package Day3;

import java.util.HashMap;
import java.util.Map;

public class Hash_map {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("One", "Orange");
		map.put("Four", "Mango");
		map.put("Three", "Banana");
		map.put("Five", "Watermelon");
		map.put("Ten", "Muskmelon");
		map.put("Two", "Kiwi");
		
		map.put(null,null);
		map.put(null, "Nothing");
		
		System.out.println(map);
		map.put("Nine", "CusturdApple");   //replace
		
		
		System.out.println(map);
		map.replace("Nine", "CusturdApple");
		
		
		//map.put("Four", 9);
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		

	}

}
