package LogicalProgram;

public class CharacterOccurence {
	public static void main(String[] args) {
		String s1 = "Swapping two numbers without third variable";

		s1 = s1.toLowerCase();

		int count = 0;

		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) == 'w') {

				count++;

			}
		}
		System.out.println(count);
	}
}
