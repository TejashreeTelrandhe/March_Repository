package AccessSpecifier;

public class Sample1 {

	public int RollNo = 30;

	public static void main(String[] args) {

		Sample1 s1 = new Sample1();

		System.out.println(s1.RollNo);

		s1.name();

	}

	public void name() { // Non static method

		System.out.println("AccessSpecifier : Public");
	}

}