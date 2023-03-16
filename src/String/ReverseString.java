package String;

public class ReverseString {

	public static void main(String[] args) {
		// WAP to reverse a string without reverse method

		String S23 = "Good morning";

		int len = S23.length();

		String Rev = "";

		for (int j = len - 1; j >= 0; j--) {

			Rev = Rev + S23.charAt(j);
			// g =g+n
		}
		System.out.println(Rev);
	}

}