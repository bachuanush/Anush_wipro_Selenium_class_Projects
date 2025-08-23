package Day8_Ans;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Queue1{
public static void main(String[] args) {
Queue<String> customerQueue = new LinkedList<>();
customerQueue.add("Customer 1");
customerQueue.add("Customer 2");
customerQueue.add("Customer 3");
customerQueue.add("Customer 4");
customerQueue.add("Customer 5");
System.out.println("Bank Queue:");
while (!customerQueue.isEmpty()) {
String customer = customerQueue.poll();
System.out.println("Serving: " + customer);
System.out.println("Remaining queue: " + customerQueue);
}
Queue<String> tasks = new LinkedList<>();
tasks.add("Print reports");
tasks.add("Email clients");
tasks.add("Update database");
System.out.println("\nNext task: " + tasks.peek());
System.out.println("Completed: " + tasks.poll());
System.out.println("Remaining tasks: " + tasks);
Queue<Integer> numberQueue = new LinkedList<>();
numberQueue.add(1);
numberQueue.add(2);
numberQueue.add(3);
numberQueue.add(4);
numberQueue.add(5);
System.out.println("\nEven numbers: " + getEvens(numberQueue));
}
private static List<Integer> getEvens(Queue<Integer> queue) {
List<Integer> evens = new ArrayList<>();
for (Integer num : queue) {
if (num % 2 == 0) evens.add(num);
}
return evens;
}
}