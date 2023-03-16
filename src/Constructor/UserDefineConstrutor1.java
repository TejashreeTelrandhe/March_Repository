package Constructor;

public class UserDefineConstrutor1 {

	// Without /zero parameter constructor

	// 1. Step - 1 Variable declaration

	int i;
	int j;

	// Step -2 Variable initialization

	public UserDefineConstrutor1() { // user define constructor

		i = 200;
		j = 100;

	}

	// Step -3 usage

	public void add() {

		int sum = i + j; // 100 +200
		System.out.println(sum);

	}

	public void Mul() {

		int mul = i * j;
		System.out.println(mul);

	}

	public void div() {

		int div = i / j;
		System.out.println(div);

	}

	public static void main(String[] args) {

		UserDefineConstrutor1 UD = new UserDefineConstrutor1();
		UD.add();
		UD.Mul();
		UD.div();
	}

}
