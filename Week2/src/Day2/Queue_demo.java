package Day2;

//Queue follows FIFO order
//duplicate elements allowed
//null values not allowed
//elements stored on the basis of hash code value

import java.util.PriorityQueue;
import java.util.Queue;

//Priority is for the First 2 Elements only.

public class Queue_demo {

	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<String>();
		q.add("Apple");
		q.add("Mango");
		q.add("Watermelon");
		q.add("Kiwi");
		q.add("Banana"); //Priority is for the First 2 Elements only.
		
		System.out.println(q);
		System.out.println(q.element());
		
		q.offer("CusturdApple");
		System.out.println(q);
		System.out.println(q.peek());
		
		q.poll();
		System.out.println(q);
		
		q.remove();
		System.out.println(q);
		
		q.remove("Kiwi");
		System.out.println(q);
		
		q.clear();
		System.out.println(q);
	}

}
