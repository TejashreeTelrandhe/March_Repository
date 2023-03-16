package Access_Specifier_SP;

public class PublicAccessSpecifier {

	public static void main(String[] args) {
		PublicAccessSpecifier p1 = new PublicAccessSpecifier();
		p1.method1();
		p1.method2();
		p1.method3();
	}

	public void method1() {
		System.out.println("public Method1");
	}

	public void method2() {
		System.out.println("public Method2");
	}

	public void method3() {
		System.out.println("public Method3");
	}
}
