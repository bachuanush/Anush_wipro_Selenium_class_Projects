package Day8_Ans;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class DeQueue1 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string to check for palindrome: ");
String input = scanner.nextLine();
System.out.println("Is palindrome? " + isPalindrome(input));
Deque<String> deque = new ArrayDeque<>();
deque.addFirst("Front 1");
deque.addLast("Rear 1");
deque.addFirst("Front 2");
deque.addLast("Rear 2");
System.out.println("\nDeque after additions: " + deque);
System.out.println("Removed from front: " + deque.removeFirst());
System.out.println("Removed from rear: " + deque.removeLast());
System.out.println("Deque after removals: " + deque);
}
private static boolean isPalindrome(String str) {
Deque<Character> deque = new ArrayDeque<>();
for (char c : str.toCharArray()) {
deque.addLast(c);
}
while (deque.size() > 1) {
if (!deque.removeFirst().equals(deque.removeLast())) {
return false;
}
}
return true;
}
}