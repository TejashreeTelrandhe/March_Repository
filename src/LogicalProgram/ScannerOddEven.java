package LogicalProgram;

import java.util.Scanner;

public class ScannerOddEven {

	public static void main(String[] args) {

//		Scanner class Odd and Even 

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter integer");

		int num = scan.nextInt();

		if (num % 2 == 0) {

			System.out.println("Number is even number");

		}

		else {

			System.out.println("Number is odd number");

		}

	}

}
