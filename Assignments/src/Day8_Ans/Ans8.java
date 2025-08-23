package Day8_Ans;

import java.util.ArrayList;
import java.util.Iterator;
public class Ans8 {
public static void main(String[] args) {
ArrayList<String> cities = new ArrayList<>();
cities.add("New York");
cities.add("London");
cities.add("Tokyo");
cities.add("Paris");
cities.add("Sydney");
Iterator<String> iterator = cities.iterator();
System.out.println("Cities in the list:");
while(iterator.hasNext()) {
String city = iterator.next();
System.out.println(city);
}
}
}

