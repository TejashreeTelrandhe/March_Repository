package Collection;

import java.util.HashMap;

public class HashMap_Collection {

	public static void main(String[] args) {
		System.out.println("HashMap : Insertion order is not preserved & underlying data structure is hashtable");
		HashMap<Integer, Character> HM = new HashMap<Integer, Character>();
		HM.put(0, 'A');
		HM.put(2, 'P');
		HM.put(1, 'C');
		HM.put(4, 'H');
		HM.put(8, 'I');
		HM.put(9, null);
		HM.put(3, null);
		System.out.println("Print hashmap " + HM);
		System.out.println("Multiple null values is accepted");
		System.out.println();

		HM.put(null, 'S');
		System.out.println(HM);
		HM.put(null, 'X');
		System.out.println(HM);
		System.out.println("Multiple null key is not allowed, only one null key is accepted, updated value is stored");
		System.out.println();

		HM.put(1, 'J');
		System.out.println(HM);
		System.out.println("Duplicate key not allowed");
		System.out.println();

		HM.put(10, 'A');
		System.out.println(HM);
		System.out.println("Duplicate values are allowed");
		System.out.println();

		System.out.println(HM.containsKey(4));
		System.out.println(HM.containsValue('S'));
		System.out.println();

		System.out.println(HM.keySet());
		System.out.println(HM.values());
		System.out.println();

		System.out.println(HM.isEmpty());
		System.out.println();

		System.out.println("Print all values");
		for (Object obj : HM.values()) {
			System.out.println(obj);
		}
		System.out.println();
		System.out.println("Print all keys");
		for (Object obj : HM.keySet()) {
			System.out.println(obj);
		}
		System.out.println();

		System.out.println("Print full Set");
		for (Object o : HM.entrySet()) {
			System.out.println(o);
		}
		System.out.println();
		for (Object oo : HM.keySet()) {
			System.out.println(oo + " - " + HM.get(oo));
		}
	}

}
