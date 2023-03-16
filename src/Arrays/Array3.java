package Arrays;

public class Array3 {

	public static void main(String[] args) {
		double d[] = new double[4];

		d[0] = 10;
		d[1] = 20;
		d[3] = 40;

		System.out.println(d[2]);

		System.out.println(d.length);

		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);

		}

	}
}