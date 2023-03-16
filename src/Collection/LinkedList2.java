package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String[] args) {

		LinkedList LL = new LinkedList(); // Hetro

		LinkedList<String> LL1 = new LinkedList<String>(); // Homo

		// Addding and inserting element in LL

		LL.add(200);
		LL.add("Welcome");
		LL.add(20.4);
		LL.add('A');
		LL.add(null);
		LL.add(true);

		System.out.println(LL);

		// Size
		System.out.println(LL.size());

		// Remove

		LL.remove(20.4);
		System.out.println(LL);

		// 3.Add element in the LL

		LL.add(3, "Java");
		System.out.println(LL);

		// 4. get();

		System.out.println(LL.get(5));

		// 5.Firstindex

		System.out.println(LL.getFirst());

		// 6.lastIndex

		System.out.println(LL.getLast());

		// 7. Set();

		LL.set(3, false);
		System.out.println(LL);

		// 8 . isempty

		System.out.println(LL.isEmpty()); // false
		System.out.println(LL1.isEmpty()); // true

		// 9 .Contains
		System.out.println(LL.contains("Welcome"));

		System.out.println(LL.contains("Hello"));

		System.out.println();
		// 10.
		System.out.println("Reading element using for loop");

		for (int i = 0; i < LL.size(); i++) {
			System.out.println(LL.get(i));
		}
		System.out.println();
		System.out.println("Reading element using for each loop");

		for (Object obj : LL) {
			System.out.println(obj);
		}

		System.out.println();
		System.out.println("Reading element using iterator");

		Iterator It = LL.iterator();
		while (It.hasNext()) {

			System.out.println(It.next());

		}
	}
}