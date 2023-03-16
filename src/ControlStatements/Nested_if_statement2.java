package ControlStatements;

public class Nested_if_statement2 {

	public static void main(String[] args) {

		int age = 10;
		int weight = 40;

		if (age >= 18) { // 20>=18 = true 15>=18false 10>=18 - f

			if (weight >= 50) { // 40>=50 true

				System.out.println("you are eligible for blood donation");
			} else {
				System.out.println("Yor are not eligible for blood donate");
			}
		} else {
			System.out.println("age must be greate than 18");
		}

	}

}