package Day8_Ans;

import java.util.LinkedList;
public class LL10{
public static void main(String[] args) {
LinkedList<Integer> originalList = new LinkedList<>();
originalList.add(10);
originalList.add(20);
originalList.add(30);
originalList.add(40);
System.out.println("Original LinkedList: " + originalList);
LinkedList<Integer> clonedList = (LinkedList<Integer>) originalList.clone();
System.out.println("Cloned LinkedList: " + clonedList);
originalList.add(50);
clonedList.removeLast();
System.out.println("\nAfter modifications:");
System.out.println("Original LinkedList: " + originalList);
System.out.println("Cloned LinkedList: " + clonedList);
}
}
