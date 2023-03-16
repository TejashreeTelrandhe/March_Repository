package LogicalProgram;

public class ReverseEachWord {
	public static void main(String[] args) {
//	Reverse the each word string

		String s1 = "left to right and right to left";

		String reverse = "";

		String word[] = s1.split(" ");

		for (String W : word) {

			String rev = "";

			System.out.println(W);

			for (int i = W.length() - 1; i >= 0; i--) {

				rev = rev + W.charAt(i);

			}

			reverse = reverse + rev + " ";

		}

		System.out.println(reverse);
	}
}
