package Arrays;

public class TowDimensionalarray2 {

	public static void main(String[] args) {

		// 2*3
		int no[][] = { { 1, 2, 3 }, { 11, 33, 21 } }; // Declaration & initialization

		int Ro[][] = { { 3, 4, 4, 5 }, { 5, 43, 6, 4 } }; // 2*4

		System.out.println(Ro.length);
		System.out.println(Ro[0].length);

		for (int i = 0; i < no.length; i++) {

			for (int j = 0; j < no[1].length; j++) {

				System.out.println(no[i][j]);
			}
		}
	}

}
