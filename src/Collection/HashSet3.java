package Collection;

import java.util.HashSet;

public class HashSet3 {

	public static void main(String[] args) {
		HashSet<Integer> HS3 = new HashSet<Integer>(); // homo

		HS3.add(1);
		HS3.add(2);
		HS3.add(3);
		HS3.add(4);
		HS3.add(5);
		HS3.add(6);

		System.out.println(HS3);

		HashSet<Integer> HS4 = new HashSet<Integer>(); // homo

		HS4.add(3);
		HS4.add(4);
		HS4.add(8);

		System.out.println(HS4);

		// Union - only unique element will displayed
//		
//		HS3.addAll(HS4);
//		System.out.println("Union :"+HS3);
//		
//		//insersection - only common element will displayed 
//		
//		HS3.retainAll(HS4);
//		System.out.println("Common :"+HS3);

		// Subset
		// System.out.println(HS3.containsAll(HS4));
	}

}