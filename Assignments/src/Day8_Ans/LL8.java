package Day8_Ans;

import java.util.LinkedList;
import java.util.ArrayList;
public class LL8 {
public static void main(String[] args) {
LinkedList<String> linkedList = new LinkedList<>();
linkedList.add("Apple");
linkedList.add("Banana");
linkedList.add("Orange");
linkedList.add("Mango");
System.out.println("Original LinkedList:");
System.out.println(linkedList);
ArrayList<String> arrayList = new ArrayList<>(linkedList);
System.out.println("\nConverted ArrayList:");
System.out.println(arrayList);
System.out.println("LinkedList size: " + linkedList.size());
System.out.println("ArrayList size: " + arrayList.size());
}
}
