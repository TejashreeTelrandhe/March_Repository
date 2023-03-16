package LogicalProgram;

public class FactorialNumber {

	public static void main(String[] args) {
		// Ex - 5*4*3*2*1= 120

		// int Number = 6;
		int fac = 1;

		for (int i = 1; i <= 6; i++) { // 2<=6 -true

			fac = fac * i; // 2=1*1

			System.out.println("Factorial of 5 is :" + fac);
		}

		System.out.println("Factorial of 5 is :" + fac);
	}

}