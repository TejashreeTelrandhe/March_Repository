package LogicalProgram;

public class PerfectNumber {
	public static void main(String[] args) {

//Perfect Number : Perfect number is the number which is equal to its sum of the factors excluding number itself.

		int a;

		int b = 6;

		int sum = 0;

		for (a = 1; a < b; a++) {

			if (b % a == 0) {

				sum = sum + a;

			}
		}
		if (sum == b) {

			System.out.println("Perfect Number");

		}

		else {

			System.out.println("Not perfect number");

		}
	}
}
