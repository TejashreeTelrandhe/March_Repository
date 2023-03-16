package Collection;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		int arr[] = new int[10]; // Static array + similar data type

		ArrayList AL = new ArrayList(2); // Dynamic array + Heterogeneous data type
		// default size =10

		ArrayList Al1 = new ArrayList();

		ArrayList<String> AL2 = new <String>ArrayList(); // Dynamic + Homo

		AL.add(20); // Int
		AL.add("Java"); // String
		AL.add(15.3); // double
		AL.add('S'); // Char
		AL.add(true); // boolean
		AL.add(20); // int
		AL.add(null); // null

		// Print Array
		System.out.println(AL);

		// Print size
		System.out.println("Number of element in given array :" + AL.size());

		// Remove
		System.out.println(AL);
		AL.remove("Java");
		System.out.println(AL);

		// Insert new element
		AL.add("Python");
		System.out.println(AL);

		AL.add(1, "Ruby");
		System.out.println(AL);

		AL.add(2, "Java");
		System.out.println(AL);

		// Retrieve specific element
		System.out.println(AL.get(1));
		System.out.println(AL.get(8));

		// Change element/Replace

		AL.set(1, "Welcome");
		System.out.println(AL);

		AL.set(1, "Hello");
		System.out.println(AL);

		// Contains -- Search element -True/false

		System.out.println(AL.contains("Ruby"));
		System.out.println(AL.contains("Python"));

		// isEmpty
		System.out.println(AL.isEmpty());
		System.out.println(Al1.isEmpty());

		System.out.println();

		System.out.println("Read/print element for loop");

		for (int i = 0; i < AL.size(); i++) {
			System.out.println(AL.get(i));
		}

	}

}