package Day8_Ans;

import java.util.Enumeration;
import java.util.Vector;
public class Vector1 {
public static void main(String[] args) {
Vector<Integer> intVector = new Vector<>();
intVector.add(10);
intVector.add(20);
intVector.add(30);
intVector.add(40);
intVector.add(50);
System.out.println("1. Original Integer Vector: " + intVector);
intVector.add(2, 25);
System.out.println(" After inserting 25 at position 3: " + intVector);
intVector.remove(1);
System.out.println(" After removing 2nd element: " + intVector);
System.out.println(" Elements using Enumeration:");
Enumeration<Integer> enumInt = intVector.elements();
while (enumInt.hasMoreElements()) {
System.out.println(" " + enumInt.nextElement());
}
Vector<String> strVector = new Vector<>();
strVector.add("Alice");
strVector.add("Bob");
strVector.add("Charlie");
strVector.add("David");
System.out.println("\n2. Original String Vector: " + strVector);
String searchName = "Bob";
System.out.println(" Does '" + searchName + "' exist? " +
strVector.contains(searchName));
strVector.set(2, "Eve");
System.out.println(" After replacing Charlie with Eve: " + strVector);
strVector.clear();
System.out.println(" After clearing: " + strVector);
Vector<Integer> copyVector = new Vector<>(intVector);
System.out.println("\n3. Copied Vector: " + copyVector);
System.out.println("4. Sum of elements: " + sumVector(intVector));
}
public static int sumVector(Vector<Integer> vec) {
int sum = 0;
for (int num : vec) {
sum += num;
}
return sum;
}
}
