package AccessSpecifier;

public class Sample4 {

	int No = 30;

	public static void main(String[] args) {

		Sample4 s4 = new Sample4();
		System.out.println(s4.No);
		s4.m1();

	}

	void m1() {

		System.out.println("AS : Default");
	}

}
