package Constructor;

public class UserDefineConstrutor2 {

	// With parameter constructor

	// Step 1 - VD
	int num; // 30
	int num1; // 40
	String name;

	public UserDefineConstrutor2() { // without para const

		num = 20;
		num1 = 20;

	}

	// 30, 40
	public UserDefineConstrutor2(int num3, int num4) {

		num = num3;
		num1 = num4;

		int add = num + num1; // 30/40
		System.out.println("Two input para :" + add);

	}

	public void add() {
		// 40 =20+20;
		int add = num + num1;
		System.out.println("Without para cons :" + add);

	}

	public static void main(String[] args) {

		UserDefineConstrutor2 UD1 = new UserDefineConstrutor2();

		UD1.add();

		UserDefineConstrutor2 UD2 = new UserDefineConstrutor2(30, 40);

	}

}
