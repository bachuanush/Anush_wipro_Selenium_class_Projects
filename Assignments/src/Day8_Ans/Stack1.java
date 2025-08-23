package Day8_Ans;

import java.util.Stack;
import java.util.Scanner;
public class Stack1{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Stack<Integer> numStack = new Stack<>();
numStack.push(10);
numStack.push(20);
numStack.push(30);
numStack.push(40);
numStack.push(50);
System.out.println("Stack after pushes: " + numStack);
System.out.println("Popped: " + numStack.pop());
System.out.println("Stack after pop: " + numStack);
System.out.println("Current top: " + numStack.peek());
System.out.println("Is stack empty " + numStack.empty());
System.out.print("\nEnter a string to reverse: ");
String input = scanner.nextLine();
Stack<Character> charStack = new Stack<>();
for (char c : input.toCharArray()) {
charStack.push(c);
}
StringBuilder reversed = new StringBuilder();
while (!charStack.empty()) {
reversed.append(charStack.pop());
}
System.out.println("Reversed string: " + reversed);
System.out.print("\nEnter an expression to check parentheses: ");
String expr = scanner.nextLine();
System.out.println("Parentheses balanced " + isBalanced(expr));
scanner.close();
}
private static boolean isBalanced(String expr) {
Stack<Character> stack = new Stack<>();
for (char c : expr.toCharArray()) {
if (c == '(') {
stack.push(c);
} else if (c == ')') {
if (stack.empty()) return false;
stack.pop();
}
}
return stack.empty();
}
}