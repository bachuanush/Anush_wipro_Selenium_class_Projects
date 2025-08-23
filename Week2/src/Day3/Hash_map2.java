package Day3;

import java.util.HashMap;
import java.util.Map;

public class Hash_map2 {

	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<Integer, String>();
		
		mp.put(1, "Hello");
		mp.put(2, "World");
		mp.put(3, "Programming");
		mp.put(4, "Java");
		
		System.out.println(mp);
		System.out.println(mp.keySet());
		System.out.println(mp.values());
		System.out.println(mp.entrySet());
		

	}

}
