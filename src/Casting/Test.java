package Casting;

public class Test {

	public static void main(String[] args) {
		Sample3 s3 = new Sample4(); // upcasting

		s3.start();
		s3.Stop();
		s3.m1();

		Sample4 s4 = (Sample4) new Sample3(); // downcasting
	}

}