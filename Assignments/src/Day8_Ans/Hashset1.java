package Day8_Ans;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class Hashset1{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
HashSet<String> cities = new HashSet<>();
cities.add("New York");
cities.add("London");
cities.add("Tokyo");
cities.add("Paris");
cities.add("Delhi");
System.out.println("Original HashSet: " + cities);
boolean added = cities.add("London");
System.out.println("'London' added " + added);
System.out.println("HashSet after adding: " + cities);
System.out.println("\nCities using Iterator:");
Iterator<String> iterator = cities.iterator();
while (iterator.hasNext()) {
System.out.println(iterator.next());
}
cities.remove("Delhi");
System.out.println("\nAfter removing 'Delhi': " + cities);
System.out.print("\nEnter city to check: ");
String city = scanner.nextLine();
System.out.println("Contains '" + city + "'? " + cities.contains(city));
cities.clear();
System.out.println("\nAfter clear(): " + cities);
System.out.println("Is empty " + cities.isEmpty());
HashSet<Integer> numbers = new HashSet<>();
numbers.add(10);
numbers.add(5);
numbers.add(20);
numbers.add(15);
System.out.println("\nInteger HashSet: " + numbers);
System.out.println("Max value: " + findMax(numbers));
scanner.close();
}
private static int findMax(HashSet<Integer> set) {
int max = Integer.MIN_VALUE;
for (int num : set) {
if (num > max) max = num;
}
return max;
}
}
