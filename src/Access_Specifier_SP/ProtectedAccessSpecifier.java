package Access_Specifier_SP;

public class ProtectedAccessSpecifier {

	public static void main(String[] args) {
		ProtectedAccessSpecifier P3 = new ProtectedAccessSpecifier();
		P3.method7();
		P3.method8();
		P3.method9();
	}
	protected void method7() {
		System.out.println("protected Method7");
	}

	protected void method8() {
		System.out.println("protected Method8");
	}

	protected void method9() {
		System.out.println("protected Method9");
	}
}
