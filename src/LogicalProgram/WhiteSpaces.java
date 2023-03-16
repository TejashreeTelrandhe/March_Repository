package LogicalProgram;

public class WhiteSpaces {
	public static void main(String[] args) {
//White spaces

		String s1 = "Reverse the each word string";

		int count = 0;

		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) == ' ') {

				count++;
			}
		}

		System.out.println(count);

	}
}
