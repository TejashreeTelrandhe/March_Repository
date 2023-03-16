package String;

public class String_Declaration {

	public static void main(String[] args) {
		String s1 = new String("charAt");// Heap memory,String constant pool
		String s2 = new String("length");// Heap memory,String constant pool

		String s3 = "isEmpty";// String constant pool
		String s4 = "replace";// String constant pool
		String s5 = "isEmpty";// String constant pool
//		isEmpty - s3,s5
		System.out.println(".equals() method");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));
		System.out.println();
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s4));
		System.out.println(s2.equals(s5));
		System.out.println();
		System.out.println(s3.equals(s4));
		System.out.println(s3.equals(s5));// true
		System.out.println();
		System.out.println(s4.equals(s5));
		System.out.println();

		System.out.println("== operator");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s1 == s5);
		System.out.println();
		System.out.println(s2 == s3);
		System.out.println(s2 == s4);
		System.out.println(s2 == s5);
		System.out.println();
		System.out.println(s3 == s4);
		System.out.println(s3 == s5);// true
		System.out.println();
		System.out.println(s4 == s5);
		System.out.println();

		String s6 = new String("home");// Heap memory,String constant pool
		String s7 = new String("shift");// Heap memory,String constant pool
		String s8 = new String("home");// Heap memory,String constant pool
		System.out.println(s6.equals(s7));// false
		System.out.println(s6.equals(s8));// true
		System.out.println();

		System.out.println(s6 == s7);// false
		System.out.println(s6 == s8);// false
		System.out.println();

		System.out.println(
				"The main difference between the .equals() method and == operator is that one is a method, and the \r\n"
						+ "		 other is the operator.We can use == operators for reference comparison (address comparison) and .equals() \r\n"
						+ "	    method for content comparison. In simple words, == checks if both objects point to \r\n"
						+ "	    the same memory location whereas .equals() evaluates to the comparison of values in the objects.");
	}

}
