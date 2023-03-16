package Loops;

public class While_Loop3 {

	public static void main(String[] args) {

		// Print 1 to 20 odd numbers using while loop

		int number = 1;

		while (number <= 20) { // 21<20 -- False

			System.out.println(number);

			number = number + 2; // 21
		}
		System.out.println("Loop Completed");
	}

}
