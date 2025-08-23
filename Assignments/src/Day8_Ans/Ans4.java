package Day8_Ans;



import java.util.ArrayList;
import java.util.Collections;
public class Ans4 {
public static void main(String[] args) {
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(3);
numbers.add(22);
numbers.add(81);
numbers.add(6);
numbers.add(42);
numbers.add(19);
numbers.add(33);
System.out.println("Original List: " + numbers);
Collections.sort(numbers);
System.out.println("Sorted List" + numbers);
}
}