package Access_Specifier_SP;

public class PrivateAccessSpecifier {

	public static void main(String[] args) {
		PrivateAccessSpecifier P2 = new PrivateAccessSpecifier();
		P2.method4();
		P2.method5();
		P2.method6();
	}

	private void method4() {
		System.out.println("private Method4");
	}

	private void method5() {
		System.out.println("private Method5");
	}

	private void method6() {
		System.out.println("private Method6");
	}
}
