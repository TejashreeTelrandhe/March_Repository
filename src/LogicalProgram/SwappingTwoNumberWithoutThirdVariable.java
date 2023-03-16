package LogicalProgram;

public class SwappingTwoNumberWithoutThirdVariable {

	public static void main(String[] args) {

		int a = 20, b = 30;

		System.out.println("Before Swapping values :" + a + " " + b);

		a = a + b; // 50
		b = a - b; // 20
		a = a - b; // 30

		System.out.println("Before Swapping values :" + a + " " + b);

	}

}