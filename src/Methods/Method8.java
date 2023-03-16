package Methods;

public class Method8 {

	public static void main(String[] args) {

		// Calling by class name
		// Method7.m1();

		// m1();
		System.out.println("Main Method started");

		Method7 m = new Method7();

		m.m1();
		m.m2();

		Method8 obj = new Method8();

		obj.m3();

		System.out.println("Main Method ended");
	}

	public void m3() {
		System.out.println("Good evening");
	}

}