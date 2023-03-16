package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class List_Interface {

	public static void main(String[] args) {
		System.out.println("ArrayList");
		System.out.println("Default capacity is 10 and incremental capacity = [(current capacity*3)/2]+1");
		System.out.println();
		ArrayList al = new ArrayList();
		al.add("Sneha");
		al.add("Shruti");
		al.add("Shiv");
		al.add("Shrikant");
		al.add("Shreya");
		System.out.println(al);
		System.out.println();
		al.add(4, "Shivaji");
		System.out.println(al);
		System.out.println();

		System.out.println("Size of the al arraylist : " + al.size());
		System.out.println();

		al.remove(0);
		System.out.println("After removing the element at 0th index : " + al);

		System.out.println();
		System.out.println("Check whether arraylist contains element : " + al.contains("Shiv"));

		System.out.println();

		ArrayList<String> al1 = new ArrayList();
		al1.addAll(al);
		System.out.println("After adding all the elements from al arraylist to al1 arraylist : " + al1);
		System.out.println();

		System.out.println("Check whether al1 contains all the element from al arraylist : " + al1.containsAll(al));
		System.out.println();

		System.out.println("Size of the al1 arraylist : " + al1.size());
		System.out.println();

		System.out.println("Print the element at 4th index of al1 arraylist : " + al1.get(4));
		System.out.println();

		System.out.println("Print the element at 0th index of al1 arraylist : " + al1.get(0));
		System.out.println();

		al1.set(0, "Ashish");
		System.out.println("Set Ashish at 0th index : " + al1);
		System.out.println();

		System.out.println("Check whether al arraylist is empty or not : " + al.isEmpty());
		System.out.println();

		al1.removeAll(al);
		System.out.println();
		System.out.println();
		Collections.sort(al);
		System.out.println("sort " + al);
		System.out.println();

		Collections.shuffle(al);
		System.out.println("shuffle " + al);
		System.out.println();

		Collections.sort(al, Collections.reverseOrder());
		System.out.println("reverseOrder " + al);
		System.out.println();

		System.out.println("Read through for loop");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println();

		System.out.println("Read through for each loop");
		for (Object o : al) {
			System.out.println(o);
		}
		System.out.println();

		System.out.println("Read through iterator");
		Iterator it = al1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println();
		ArrayList AL = new ArrayList();
		AL.add("Array");
		AL.add('A');
		AL.add(10);
		AL.add(true);
		AL.add(15.25f);
		AL.add(56.52);
		AL.add(784596l);
		System.out.println("Print all elements in AL arraylist : " + AL);
		System.out.println("Size of AL arraylist : " + AL.size());
		System.out.println();

		System.out.println("Print element at 1st index of AL arraylist : " + AL.get(1));
		System.out.println();

		AL.remove(0);
		System.out.println("ArrayList after removing element at 0th index : " + al);
		System.out.println();

		AL.set(1, "Collection");
		System.out.println("After setting Collection at 1st index of arraylist : " + AL);
		System.out.println();

		System.out.println("Read element through for loop");
		for (int i = 0; i < AL.size(); i++) {
			System.out.println(AL.get(i));
		}
		System.out.println();

		System.out.println("Read element through for each loop");
		for (Object obj : AL) {
			System.out.println(obj);
		}
		System.out.println();

		System.out.println("Read element through iterator");
		Iterator IT = AL.iterator();
		while (IT.hasNext()) {
			System.out.println(IT.next());
		}
		System.out.println();

		String arr[] = { "for", "switch" };
		for (String in : arr) {

			System.out.println(in);
		}
		ArrayList aa = new ArrayList(Arrays.asList(arr));
		System.out.println("Convert array into arraylist");
		System.out.println(aa);

		System.out.println();
		System.out.println("LinkedList");
		System.out.println("No inherent capacity, underlying data structure is doubly linked list");
		LinkedList LL = new LinkedList();

		LL.add("Abhi");
		LL.add('A');
		LL.add('B');
		LL.add(0);
		LL.add(true);
		LL.add(45.65);
		System.out.println("Print elements in LL arraylist : " + LL);
		System.out.println();

		LL.add(1, false);
		System.out.println("Adding element at 1st index in LL arraylist : " + LL);
		System.out.println();

		LinkedList<String> LL1 = new LinkedList<String>();
		LL1.add(0, "file");
		LL1.add(1, null);
		LL1.add(2, "edit");
		LL1.add(3, "source");
		LL1.add(4, "run");
		System.out.println("Print elements in LL1 arraylist : " + LL1);
		System.out.println();

		LinkedList<String> LL2 = new LinkedList<String>();
		LL2.addAll(LL1);
		System.out.println("Print elements in LL2 arraylist after adding all elements from LL1 : " + LL2);
		System.out.println();

		LL2.add(5, "help");
		System.out.println("Print elements in LL2 arraylist after adding source at 5th index : " + LL2);
		System.out.println();

		LL2.add("window");
		System.out.println("Print elements in LL2 arraylist after adding null : " + LL2);
		System.out.println();

		LL2.removeAll(LL1);
		System.out.println("Print elements in LL2 arraylist after removing all elements from LL1 : " + LL2);
		System.out.println();

		LL2.remove(1);
		System.out.println("Print elements in LL2 arraylist after removing element at 1st index : " + LL2);
		System.out.println();

		LL2.remove("help");
		System.out.println("Print elements in LL2 arraylist after removing help : " + LL2);
		System.out.println();

		System.out.println("Check LL2 linked list is empty : " + LL2.isEmpty());
		System.out.println();

		System.out.println("Check LL1 linked list is empty : " + LL1.isEmpty());
		System.out.println();

		LL2.addAll(LL1);
		System.out.println(LL2);
		System.out.println();

		LL2.set(0, null);
		LL2.set(1, "refactor");
		LL2.set(2, "navigate");
		LL2.set(3, "project");
		System.out.println("Print LL2 after setting element at 0,1,2,3 index : " + LL2);
		System.out.println();

		System.out.println("Check in LL Linkedlist contains A element : " + LL.contains('A'));
		System.out.println();

		System.out.println(
				"Check all elements in LL1 Linkedlist are present in LL2 linkedlist : " + LL2.containsAll(LL1));
		System.out.println();

		LinkedList<Integer> LL3 = new LinkedList<Integer>();
		LL3.add(1);
		LL3.add(5);
		LL3.add(15);
		LL3.add(75);
		LL3.add(63);
		LL3.add(45);
		System.out.println("Print elements in LL3 linkedlist : " + LL3);
		System.out.println();

		System.out.println("Print element at 0th index in LL3 LinkedList : " + LL3.get(0));
		System.out.println();

		System.out.println("Sorting the elements in linkedlist");
		Collections.sort(LL3);
		System.out.println(LL3);
		System.out.println();

		System.out.println("Shuffling the elements in linkedlist");
		Collections.shuffle(LL3);
		System.out.println(LL3);
		System.out.println();

		System.out.println("Reversing the elements in linkedlist");
		Collections.sort(LL3, Collections.reverseOrder());
		System.out.println(LL3);
		System.out.println();

		System.out.println("Read elements using for loop");
		for (int i = 0; i < LL.size(); i++) {
			System.out.println(LL.get(i));
		}
		System.out.println();

		System.out.println("Read elements using for each loop");
		for (Object obj : LL1) {
			System.out.println(obj);
		}
		System.out.println();

		System.out.println("Read elements using iterator");
		Iterator It = LL2.iterator();
		while (It.hasNext()) {
			System.out.println(It.next());
		}
		System.out.println();

		System.out.println("Vector");
		System.out.println("Legacy class with incremental capacity = current capacity*2");

		Vector v = new Vector();
		v.add("A");
		v.add('B');
		v.add(true);
		v.add(false);
		v.add(1.5);
		v.add(56.32f);
		System.out.println("Print all element in vector v : " + v);
		System.out.println();
		
		System.out.println("Size of the vector : " + v.size());
		System.out.println();
		
		v.set(3, "search");
		System.out.println("Print after setting search at 3rd index in vector v : " + v);
		System.out.println();

		System.out.println("Print element at 3rd index : " + v.get(3));
		System.out.println();

		v.remove(3);
		System.out.println("Print after removing element at 3rd index " + v);
		System.out.println();

		v.remove(true);
		System.out.println("Print after removing true element in vector v : " + v);
		System.out.println();
		
		Vector vv = new Vector();
		vv.add('A');
		vv.add('C');
		vv.add('J');
		vv.add('F');
		vv.add('S');
		System.out.println("Printing vv vector : "+vv);
		System.out.println();
		
		System.out.println("Sorting the vector");
		Collections.sort(vv);
		System.out.println(vv);
		System.out.println();

		System.out.println("Shuffling the vector");
		Collections.shuffle(vv);
		System.out.println(vv);
		System.out.println();

		System.out.println("Shuffling the vector");
		Collections.sort(vv, Collections.reverseOrder());
		System.out.println(vv);
		System.out.println();

		System.out.println("Read elements in vector using for loop");
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println();
		
		System.out.println("Read elements in vector using for each loop");
		for(Object o : v) {
			System.out.println(o);
		}
		System.out.println();
		
		System.out.println("Read elements in vector using iterator");
		Iterator tt = v.iterator();
		while(tt.hasNext()) {
			System.out.println(tt.next());
		}
		System.out.println();

	}
}