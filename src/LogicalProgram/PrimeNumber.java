package LogicalProgram;

public class PrimeNumber {
//	Prime number : Prime number is the number that is divisible by 1 and number itself.
	public static void main(String[] args) {
		int num = 7;
		int count = 0;

		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}

		if (count == 1) {
			System.out.println("Prime number");
		}

		else {
			System.out.println("Not a prime number");
		}
	}
}