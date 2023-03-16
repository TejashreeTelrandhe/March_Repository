package Constructor;

public class UserDefineConstrutor3 {

	int a;
	int b;
	double c;

	public UserDefineConstrutor3() { // Zero parameter cons

		a = 10;
		b = 20;
		c = 40.44;

	}

	public UserDefineConstrutor3(int a, int b) { // Two input parameter cons

		this.a = a; // 20
		this.b = b; // 33

	}

	public UserDefineConstrutor3(int x, double y) {

		a = x;
		c = y;

	}

	public UserDefineConstrutor3(int x, int y, double z) { // three input

		a = x;
		b = y;
		c = z;
	}

	public void Display() {

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		System.out.println();
	}

	public static void main(String[] args) {

		UserDefineConstrutor3 UD1 = new UserDefineConstrutor3();
		UD1.Display();

		UserDefineConstrutor3 UD2 = new UserDefineConstrutor3(20, 30);
		UD2.Display();

		UserDefineConstrutor3 UD3 = new UserDefineConstrutor3(20, 30.3);
		UD3.Display();

		UserDefineConstrutor3 UD4 = new UserDefineConstrutor3(20, 30, 40.5);
		UD4.Display();

	}

}
