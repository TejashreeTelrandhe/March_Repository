package LogicalProgram;

import java.util.Scanner;

public class StringInputFromUser {

	public static void main(String[] args) {
//      String input from user 

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter string");

		String s1 = scan.nextLine();

		System.out.println(s1);
	}

}
