package Methods;

public class Method10 {

	public static void main(String[] args) {
		
		Method10.addition(22, 10); // 32
		Method10.addition(10, 10);

		Method10.Substraction(40, 10);
		Method10.Substraction(40, 20);

		Method10.m1("Rohit");
	}

	public static void addition(int x, int y) { // Two input parameter method

		int z = x + y; // 22 , 10
		System.out.println("Additon of two no is :" + z);
	}

	public static void Substraction(int a, int b) {

		int c = a - b; // 40 - 10 = 30
		System.out.println(c);
	}

	public static void m1(String s) { // one input parameter method
		System.out.println(s);
	}

}
