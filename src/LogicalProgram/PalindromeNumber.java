package LogicalProgram;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		// 1234 - Not
		// 1221 - 1221 1221

		int sum, Originalno, rem;
		System.out.println("Enter a number");

		Scanner Sc = new Scanner(System.in);

		int num = Sc.nextInt(); // = 153

		Originalno = num; // 121
		// 123>0 - true
		// 12>0 - true
		// 1>0 -true
		// 0>0 - false
		for (sum = 0; num > 0; num = num / 10) { // 123/10 =12 12/10 =1 1/10 = 0

			rem = num % 10; // 123%10 -3 12%10 = 2 1%10 =1

			sum = sum * 10 + rem;
			// 3 =0*10+3
			// 32 =3*10+2 = 32
			// 321 =32*10+1 = 321
		}

		if (sum == Originalno) // 321==123
			System.out.println("Palindrome Number");
		else
			System.out.println("Not Palindrome number");
	}

}