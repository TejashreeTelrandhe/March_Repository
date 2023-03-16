package Collection;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
		Hashtable<Integer, String> HB = new Hashtable<Integer, String>();
//      Default size = 10; DLF = 0.75
		HB.put(2, "Sumit");
		HB.put(1, "Prashant");
		HB.put(3, "Rohit");
		HB.put(6, "Rohit");
		System.out.println("Print hashtable : " + HB);
		System.out.println();

//		HB.put(null, "Abhishek");// NullPointerException
//		HB.put(4, null);// NullPointerException

		System.out.println("Hashtable doesnot allow null key or null value");
		System.out.println("Duplicate value allowed : " + HB);
		System.out.println();

		HB.put(6, "Ishwar");
		System.out.println("Duplicate key not allowed updated value of key is considered : " + HB);
		System.out.println();

		System.out.println("Check key is present in hashtable containsKey 2 : " + HB.containsKey(2));
		System.out.println("Check value is present in hashtable containsValue Rohit : " + HB.containsValue("Rohit"));
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
