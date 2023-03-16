package String;

public class String1 {

	public static void main(String[] args) {

//      String by new keyword	

//		String S = new String("java Automation");   

//		String S1 = "Selenium";

		String s2 = new String("Velocity");

		String s3 = new String("Velocity");

		s3.concat("Classes");

		System.out.println(s3);

		System.out.println(s2 == s3); // False
		System.out.println(s2.equals(s3)); // True

	}

}