package JavaBasics;

public class NonStaticMethod_SC {

	public static void main(String[] args) {
		NonStaticMethod_SC SC = new NonStaticMethod_SC();
		SC.m1();
		SC.m2();
	}
public void m1() {
	String s1 = "Static";
	String s2 = "Method";
	System.out.println(s1.concat(s2));
}
public void m2() {
	String s3 = "System";
	String s4 = "Library";
	System.out.println(s3.concat(s4));
}
}
