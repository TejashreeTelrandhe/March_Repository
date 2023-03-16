package Casting;

public class Sample4 extends Sample3 {

	public void Automatic() {
		System.out.println("kia - automatic");
	}

	public void Stop() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		Sample3 s3 = new Sample4(); // upcasting

		s3.start();
		s3.Stop();
		s3.m1();

	}
}