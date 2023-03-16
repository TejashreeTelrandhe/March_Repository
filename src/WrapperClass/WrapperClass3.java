package WrapperClass;

public class WrapperClass3 {

	public static void main(String[] args) {
		String Value1 = "200.95";
		String Value2 = "300.05";

		// int result = Value1+Value2;

		System.out.println(Value1 + Value2); //

		double V1 = Double.parseDouble(Value1);

		double V2 = Double.parseDouble(Value2);

		double sum = V1 + V2;

		System.out.println(sum);

		if (sum == 501) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
	}
}