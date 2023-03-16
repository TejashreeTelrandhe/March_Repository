package String;

public class ReverseEachWord {

	public static void main(String[] args) {

		String S1 = "Welcome to java and selenium";
		// Expected o/p - = emoclew ot avaj dna muineles
		// emocleW ot avaj dna muineles
		// muineles dna avaj ot emoclew

		String RevString = "";

		String[] word = S1.split(" ");
		// Welcome -0
		// to -1
		// java-2
		// and -3
		// selenium -4

		// Welcome
		for (String W : word) {

			String ReverseWord = "";

			for (int i = W.length() - 1; i >= 0; i--) {
				// 0 = 0 +e
				ReverseWord = ReverseWord + W.charAt(i);
				// emoclew
			}
			RevString = RevString + ReverseWord + " ";
		}

		System.out.println(RevString);

	}

}