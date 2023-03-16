package Demo;

public class Void1 {
	public static void main(String[] args) {
		
		addition(20, 30);
		
		int number = adddition1(30, 40);
		
		System.out.println(number);
	}

	public static void addition(int a, int b) {
		int sum = a + b;

		System.out.println(sum);

		adddition1(30, 100);

	}

	public static int adddition1(int a, int b) {

		int sum = a + b;

		System.out.println(sum);

		return sum;

	}
}