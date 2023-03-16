package AccessSpecifier;

public class Sample5 {

	protected int Rollno1 = 100;

	public static void main(String[] args) {

		Sample5 s5 = new Sample5();

		System.out.println(s5.Rollno1);
		s5.m2();

	}

	protected void m2() {

		System.out.println("AS : Protected");
	}

}
