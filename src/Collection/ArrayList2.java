package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList AL = new ArrayList();

		ArrayList Duplicate = new ArrayList();

		AL.add("a");
		AL.add("d");
		AL.add("c");
		AL.add("b");

		System.out.println(AL);

		// AddAll
		Duplicate.addAll(AL);
		System.out.println(Duplicate);

		Duplicate.removeAll(AL);
		System.out.println("After removing :" + Duplicate);

		// Collections methods
		System.out.println("Element in the Array :" + AL);

		Collections.sort(AL);
		System.out.println("After sorting :" + AL);

		Collections.sort(AL, Collections.reverseOrder());
		System.out.println("Reverse order :" + AL);

		Collections.shuffle(AL);
		System.out.println("After Shuffle :" + AL);

	}

}