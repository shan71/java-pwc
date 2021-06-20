package collections;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> myqueue = new PriorityQueue<String>();

		myqueue.add("One");
		myqueue.add("Two");
		myqueue.add("Three");
		myqueue.add("Four");
		myqueue.add("Five");
		myqueue.add("Six");

		System.out.println(myqueue);

		System.out.println(myqueue.peek());

		System.out.println(myqueue);

		System.out.println(myqueue.remove());

		System.out.println(myqueue);
		
		

	}

}
