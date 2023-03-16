package LogicalProgram;

public class CountStartingWordLetter {
	public static void main(String[] args) {
		String s1 = "Perfect number is the number which is equal to its sum of the factors excluding number itself.";

		String arr[] = s1.split(" ");

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			String word = arr[i];

			for (int j = 0; j < word.length(); j++) {

				if (word.charAt(0) == 'i' || word.charAt(0) == 'n') {

					count++;

				}

				word = "";

			}

		}

		System.out.println(count);
	}
}
