package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {

		HashSet HS = new HashSet(); // Default size 16 and load factor = 0.75

		HashSet HS1 = new HashSet(50, (float) 0.90);

		HashSet<Integer> HS3 = new HashSet<Integer>(50, (float) 0.90); // homo

		HS.add(200);
		HS.add("Java");
		HS.add(13.2);
		HS.add('A');
		HS.add(true);
		HS.add(false);
		HS.add(11);
		HS.add(null);
		HS.add(200);

		System.out.println(HS);
		System.out.println(HS.add('B'));
		// if we trying to add duplicate elements then it will give false
		System.out.println(HS);

		System.out.println(HS.contains("Java"));

		// Remove
		HS.remove("Java");
		System.out.println(HS);

		// Set/get method is not present in hashset

		// contains
		System.out.println(HS.contains("Java"));

		// isempty
		System.out.println(HS.isEmpty());
		System.out.println(HS1.isEmpty());

		// Reading element from hashset

//		for(int i=0 ;i<HS.size();i++) {
//			
//			System.out.println(HS.get);
//		}
		System.out.println();

		for (Object obj : HS) { // [null, Java, A, false, 200, 11, 13.2, true]
			System.out.println(obj);
		}

		// iterator
		System.out.println();
		Iterator it = HS.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}