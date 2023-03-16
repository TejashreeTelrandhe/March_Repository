package LogicalProgram;

import java.util.Scanner;

public class AcceptUserInput {

	public static void main(String[] args) {

		System.out.println("Enter First number");

		Scanner Sc = new Scanner(System.in);

		int No1 = Sc.nextInt();

		System.out.println("Enter second number");

		int No2 = Sc.nextInt();

		System.out.println("Addition of two number is ==" + (No1 + No2));
	}

}