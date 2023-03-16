package Hierarchial_Inheritance;

public class Son1 extends FatherClass{   // Subclass1
	
	public void mobile() {
		
		System.out.println("Mobile -- OnePlus");
	}
	
	public static void main(String[] args) {		
		Son1 s1 = new Son1();
		s1.mobile();
		s1.Property();
	}
	
}
