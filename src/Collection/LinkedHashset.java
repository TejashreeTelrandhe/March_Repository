package Collection;

import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		// Same methods are implemented which are present in HAshSet
		// Duplicate element are not allowed
		// insertion order is preserved
		// default capacity - 16 & 0.75%

		LinkedHashSet LHS = new LinkedHashSet();

		LHS.add(200);
		LHS.add(300);
		LHS.add(400);
		LHS.add(100);

		System.out.println(LHS);
	}

}