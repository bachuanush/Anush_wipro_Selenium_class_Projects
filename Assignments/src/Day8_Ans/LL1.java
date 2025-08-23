package Day8_Ans;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
public class LL1{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
LinkedList<Integer> numbers = new LinkedList<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);
numbers.add(40);
numbers.add(50);
System.out.println("1. Original LinkedList: " + numbers);
numbers.addFirst(5);
numbers.addLast(60);
System.out.println("\n2. After adding first and last elements: " + numbers);
numbers.add(3, 25);
System.out.println("\n3. After inserting 25 at position 3: " + numbers);
System.out.println("\n4. Removal Operations:");
System.out.println("Original list: " + numbers);
numbers.removeFirst();
System.out.println("After removing first element: " + numbers);
numbers.removeLast();
System.out.println("After removing last element: " + numbers);
numbers.remove(Integer.valueOf(25));
System.out.println("After removing value 25: " + numbers);
System.out.print("\n5. Enter a number to search: ");
int searchNum = scanner.nextInt();
if (numbers.contains(searchNum)) {
System.out.println(searchNum + " found in the list at position " +
numbers.indexOf(searchNum));
} else {
System.out.println(searchNum + " not found in the list");
}
System.out.println("\n6. ListIterator Demonstration:");
ListIterator<Integer> iterator = numbers.listIterator();
System.out.print("Forward iteration: ");
while (iterator.hasNext()) {
System.out.print(iterator.next() + " ");
}
System.out.print("\nBackward iteration: ");
while (iterator.hasPrevious()) {
System.out.print(iterator.previous() + " ");
}
Collections.sort(numbers);
System.out.println("\n\n7. Sorted LinkedList: " + numbers);
scanner.close();
}
}