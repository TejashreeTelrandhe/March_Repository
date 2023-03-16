package Collection;

import java.util.Hashtable;

public class HashTable_Collection {

	public static void main(String[] args) {
		Hashtable<Integer, String> HB = new Hashtable<Integer, String>();
//		HB.put(null, "zero");
		HB.put(1, "first");
//		HB.put(2, null);
		System.out.println("Hashtable doesnot allow null key or null value");
		HB.put(3, "third");
		HB.put(4, "fourth");
		HB.put(5, "fifth");
		System.out.println("Print hashtable : " + HB);
		System.out.println();

		HB.put(2, "second");
		HB.put(2, "second updated");
		System.out.println("Duplicate key not allowed updated value of key is considered : " + HB);
		System.out.println();

		System.out.println("Check key is present in hashtable containsKey : " + HB.containsKey(2));
		System.out.println("Check value is present in hashtable containsValue : " + HB.containsValue("third"));
		System.out.println("Check hashtable is empty or not : " + HB.isEmpty());
		System.out.println();
		
		System.out.println("Print only key : " + HB.keySet());
		System.out.println();
		
		System.out.println("Print only key : " + HB.values());
		System.out.println();
		
		for (Object obj : HB.keySet()) {
			System.out.println(obj);
		}
		
		System.out.println();
		for (Object o : HB.values()) {
			System.out.println(o);
		}
		
		
	}
}
