package Methods;

public class Method5 {

	public static void main(String[] args) {
		// Non - static regular method calling from same class

		// 1. Direct calling by method name
		// Nonstaticm1();

		// 2. Calling by class name
		// Method5.Nonstaticm1();

		// Object creation

		System.out.println("Main Method started");

		// syntax - Classname RefVariablename = new Classname();

		Method5 obj = new Method5();

		obj.Nonstaticm1();
		obj.Nonstaticm2();
		obj.m3(); //static method can be called with ref.methodname
		m3();

		System.out.println("Main Method Ended");
	}

	public void Nonstaticm1() {

		System.out.println("Non - static regular method calling from same class : M1");
	}

	public void Nonstaticm2() {
		System.out.println("Non - static regular method calling from same class : M2");
	}

	public static void m3() {
		System.out.println("Static method");
	}

	// Question - Can u access static method by using obj reference?
	// Yes, we can access static method by using obj ref but it will give one
	// warning message.
}
