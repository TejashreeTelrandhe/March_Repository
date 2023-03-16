package TypesOfVariables;

public class LocalVariable1 {

	public static void main(String[] args) {		
		LocalVariable1.m1();
		LocalVariable1.m2();
	}
	
	public static void m1() {
		int a = 10; // you can use this variable only within that method body		
		System.out.println(a);
	//	System.out.println(b);
	}
	
	public static void m2() {		
		int b =20;
		//System.out.println(a);
		System.out.println(b);
	}

}