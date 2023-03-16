package Collection;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		
		PriorityQueue  PQ =new PriorityQueue();
		PriorityQueue  PQ1 =new PriorityQueue();
		
		// Insertion order is preserved
		// Duplicate are allowed
		// Homogenous type of data
		
		//Adding elements 1.Add 2. offer
		
		PQ.add("S");
		PQ.add("E");
		PQ.add("Z");
		System.out.println(PQ);
		
		PQ.offer("C");
		PQ.offer("S");
		PQ.offer("J");
		
		System.out.println(PQ);
		
	//	System.out.println(PQ.add(30));  //classcastexception
		
		System.out.println(PQ.isEmpty());
		
		
		//Head elements 
		//3 Element 4. Peek
		
	//	System.out.println(PQ1.element());    // NoSuchElementException
		System.out.println(PQ.element());    //if the queue is empty it will throw nosuchelementexceptio
		
		System.out.println("Head element :"+PQ.peek());  
		System.out.println(PQ1.peek()); //if the queue is empty it will throw NUll
		
		
	//	Remove head element
		//5 Remove  6. Poll
		
		System.out.println(PQ.remove()); // NoSuchElementException
		System.out.println(PQ);
		
		System.out.println(PQ.poll());
		System.out.println(PQ1.poll());

		System.out.println("Reading element using for each loop");
		
		for(Object obj :PQ) {
			
			System.out.println(obj);
		}
	}
	


}