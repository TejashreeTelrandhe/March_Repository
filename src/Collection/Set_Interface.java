package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set_Interface {

	public static void main(String[] args) {
		HashSet HS = new HashSet();
		HS.add(200);
		HS.add("Java");
		HS.add(13.2);
		HS.add(true);
		HS.add(false);
		System.out.println("Print all elements in the HashSet : " + HS);
		System.out.println();

		HS.add("Selenium");
		System.out.println("Print HashSet : " + HS);
		System.out.println();

		HS.add(13.2);
//		We cannot at duplicate elements
		System.out.println("We cannot at duplicate elements " + HS);
		System.out.println();

		System.out.println("Check the element is present or not " + HS.contains('D'));
		System.out.println();

		System.out.println("Set and get method is absent in set interface");
		System.out.println();
		System.out.println("Check HashSet is empty or not : " + HS.isEmpty());
		System.out.println();

		System.out.println("Read element using iterator");
		Iterator it = HS.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();

		System.out.println("Read element using for each loop");
		for (Object obj : HS) {
			System.out.println(obj);
		}
		System.out.println();
//		System.out.println("Read element using for loop");
//		for (int i = 0; i < HS.size(); i++) {
//			System.out.println(HS.get(i));//The method get(int) is undefined for the type HashSet
//		}

		HashSet<Object> HS1 = new HashSet<Object>();
		HS1.addAll(HS);
		System.out.println("Print element in HS1 HashSet using addall method : " + HS1);
		System.out.println();

		HS1.removeAll(HS);
		System.out.println("Remove element in HS1 HashSet using removeall method : " + HS1);
		System.out.println();

		HashSet<Character> HS2 = new HashSet<Character>(); // homo

		HS2.add('a');
		HS2.add('b');
		HS2.add('k');
		HS2.add('l');
		HS2.add('c');
		HS2.add('m');

		System.out.println(HS2);

		HashSet<Character> HS3 = new HashSet<Character>(); // homo

		HS3.add('k');
		HS3.add('l');
		HS3.add('m');

		HS2.addAll(HS3);
		System.out.println("Union elements displayed using addAll: " + HS2);
		System.out.println();

		HS2.retainAll(HS3);
		System.out.println("Common elements displayed using retainAll : " + HS2);
		System.out.println();

		System.out.println(HS2.containsAll(HS3));
		System.out.println();

		System.out.println("LinkedHashSet");
		System.out.println(
				"Duplicate element are not allowed, insertion order is preserved,default capacity - 16 & 0.75%");
		System.out.println();

		LinkedHashSet LHS = new LinkedHashSet();
		LHS.add("union");
		LHS.add("retainall");
		LHS.add("intersection");
		LHS.add("remove");
		LHS.add(null);
		LHS.add(true);
		LHS.add(null);
		System.out.println("Print elements in LinkedHashSet : " + LHS);

		for (Object o : LHS) {
			System.out.println(o);
		}
	}

}
