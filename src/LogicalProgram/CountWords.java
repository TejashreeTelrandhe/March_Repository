package LogicalProgram;

public class CountWords {

	public static void main(String[] args) {
// Count words in the string

		String s1 = "Swapping two numbers without third variable";

		int count = 1;

		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) == ' ' && s1.charAt(i + 1) != 0) {

				count++;

			}
		}
		System.out.println(count);
	}
}
