package Hierarchial_Inheritance;
public class Son3 extends FatherClass{

	public void laptop() {
		
	System.out.println("Laptop -- Dell");
				
	}
	
	public static void main(String[] args) {
		
		Son3 s3 = new Son3();
		s3.laptop();
		s3.Property();
		
		FatherClass F3 = new Son3();   // Top Casting 		
		F3.Property();
		
	}
}
