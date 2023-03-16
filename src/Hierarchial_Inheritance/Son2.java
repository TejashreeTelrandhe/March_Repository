package Hierarchial_Inheritance;

public class Son2 extends FatherClass {

	public void Bike() {
	System.out.println("Bike -- FZ");
	}

	public static void main(String[] args) {

		Son2 s2 = new Son2();
		s2.Bike();
		s2.Property();
	}
}
