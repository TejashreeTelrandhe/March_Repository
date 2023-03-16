package JavaBasics;

public class NonStaticMethod_DC {

	public static void main(String[] args) {
		NonStaticMethod_DC DC = new NonStaticMethod_DC();
		DC.m3();
		DC.m4();
		
		System.out.println();
		
		NonStaticMethod_SC SC = new NonStaticMethod_SC();
		SC.m1();
		SC.m2();
	}
	public void m3() {
		String s1 = "Java";
		String s2 = "Virtual";
		String s3 = "Machine";
		System.out.println(s1.concat(s2).concat(s3));
	}
	public void m4() {
		String s3 = "Code";
		String s4 = "Compiler";
		System.out.println(s3.concat(s4));
	}
}
