package AccessSpecifier;

public class Sample3 {

	private int Pinno = 84848484;

	public static void main(String[] args) {

		Sample3 s3 = new Sample3();

		System.out.println(s3.Pinno);
		s3.demo();
	}

	private void demo() {

		System.out.println("AS : Private");
	}

}
