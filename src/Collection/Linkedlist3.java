package Collection;

import java.util.Collections;
import java.util.LinkedList;

public class Linkedlist3 {

	public static void main(String[] args) {

		LinkedList <String>  LL =new LinkedList<String>();
		
		LL.add("A");
		LL.add("w");
		LL.add("h");
		LL.add("g");
		LL.add("s");
		LL.add("v");
		
		System.out.println(LL);
		
		LinkedList <String>  LL1 =new LinkedList<String>();
		
		//Addall
		LL1.addAll(LL);
		System.out.println(LL1);

		// Removeall
		LL1.removeAll(LL);
		System.out.println(LL1);
		System.out.println(LL1.isEmpty());
		
		//Collection - sort
		
		Collections.sort(LL);
		System.out.println(LL);
		
		Collections.sort(LL,Collections.reverseOrder());
		System.out.println(LL);
		
		//Shuffle
		
		Collections.shuffle(LL);
		System.out.println(LL);
		
		//AddFirst
		
		LL.addFirst("Hello");
		System.out.println(LL);
		
		LL.addLast("Hi");
		System.out.println(LL);
	}

}