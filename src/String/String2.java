package String;

public class String2 {

	public static void main(String[] args) {

		// How many string object will created

		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		String s4 = new String("Java");
		String s5 = "Java";

		System.out.println(s1 == s2); // false

		System.out.println(s1 == s3); // false

		System.out.println(s1 == s5); // True

		System.out.println(s3.equals(s4)); // True

		System.out.println(s1.equals(s2)); // True

		System.out.println(s1.equals(s4)); // True

	}

}