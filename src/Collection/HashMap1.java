package Collection;

import java.util.HashMap;

public class HashMap1 {
	public static void main(String[] args) {

		HashMap<Integer, String> HM = new HashMap<Integer, String>();

		HM.put(106, "Rahul"); // Pair/entry
		HM.put(102, "Suresh");
		HM.put(103, "Mangesh");
		HM.put(104, "Ketan");
		HM.put(108, "Mangesh");
		HM.put(111, null);
		HM.put(112, null);

		System.out.println(HM);
		// HashMap - Underlying DS is HashTable

		// Insertion order is not preserved
		// Duplicate key not allowed
		// Duplicate values are allowed
		// Null key allowed only once
		// Null value can be added multiple time

		System.out.println(HM.get(103));
		HM.remove(112);
		System.out.println(HM);

		System.out.println(HM.containsKey(106));
		System.out.println(HM.containsKey(105));

		System.out.println();

		System.out.println(HM.containsValue("RRR"));
		System.out.println(HM.containsValue("Ketan"));

		System.out.println();

		System.out.println(HM.keySet());
		System.out.println();
		System.out.println(HM.values());

		System.out.println();
		System.out.println(HM.entrySet());

		System.out.println();
		for (Object obj : HM.keySet()) {
			System.out.println(obj);
		}

		System.out.println();
		for (Object obj1 : HM.values()) {
			System.out.println(obj1);
		}

		System.out.println();
		for (Object obj1 : HM.entrySet()) {
			System.out.println(obj1);
		}
		System.out.println();
		for (Object obj : HM.keySet()) {
			System.out.println(obj + " " + HM.get(obj));
		}
	}
}
