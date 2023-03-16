package LogicalProgram;

public class FibonnaciSeries {

	public static void main(String[] args) {
		// in FS next number is sum of previous two numbers

		// Ex- 0,1,1,2,3,5,8,13,21,34,55,89

		int a = -1, b = 1, c;

		for (int i = 0; i <= 100; i++) {

			c = a + b; // -1+1
			System.out.print(" " + c);
			a = b;
			b = c;
		}
	}

}