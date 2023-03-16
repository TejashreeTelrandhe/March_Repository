package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue_Interface {

	public static void main(String[] args) {
		System.out.println("PriorityQueue");
		System.out.println("Insertion order maintained, stores homogenous data");
		System.out.println();

		PriorityQueue PQ = new PriorityQueue();
		PriorityQueue PQ1 = new PriorityQueue();

		PQ.add("list");
		PQ.offer("set");
		PQ.add("queue");
		PQ.offer("priority");
		PQ.add("deque");
		System.out.println("Print element of Priority Queue : " + PQ);
		System.out.println();

		System.out.println("Print head element using peek method : " + PQ.peek());
		System.out.println();

		System.out.println("Remove head element using poll method : " + PQ.poll());
		System.out.println();

		System.out.println("Print head element using peek element : " + PQ.element());
		System.out.println();

		System.out.println("Remove head element using remove method : " + PQ.remove());
		System.out.println();

		System.out.println("Check  PQ priority queue is empty or not : " + PQ.isEmpty());
		System.out.println();

		System.out.println("Check  PQ1 priority queue is empty or not : " + PQ1.isEmpty());
		System.out.println();

		System.out.println("If PriorityQueue is empty then");
//		System.out.println("Remove head element using remove method from empty queue : " + PQ1.remove());//NoSuchElementException
		System.out.println("Remove head element using poll method from empty queue : " + PQ1.poll());// null
//		System.out.println("Print head element using peek element from empty queue : " + PQ1.element());//NoSuchElementException
		System.out.println("Print head element using peek method from empty queue : " + PQ1.peek());// null
		System.out.println();

		System.out.println("Read element using iterator");
		Iterator it = PQ.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
