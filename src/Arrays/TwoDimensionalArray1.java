package Arrays;

public class TwoDimensionalArray1 {

	public static void main(String[] args) {

		String str[] = new String[4]; // Single
		// str[0 ]="A"

		String S[][] = new String[4][5]; // Row & columns

		System.out.println(S.length); // Total no rows /Size/length

		System.out.println(S[3].length);// Total no Columns

		// First Row
		S[0][0] = "A1";
		S[0][1] = "A2";
		S[0][2] = "A3";
		S[0][3] = "A4";
		S[0][4] = "A5";

		System.out.println(S[0][3]);

		// Second Row

		S[1][0] = "B1";
		S[1][1] = "B2";
		S[1][2] = "B3";
		S[1][3] = "B4";
		S[1][4] = "B5";

		System.out.println(S[1][0]);

		// Third Row
		S[2][0] = "C1";
		S[2][1] = "C2";
		S[2][2] = "C3";
		S[2][3] = "C4";
		S[2][4] = "C5";

		System.out.println(S[2][2]);
		//
		S[3][0] = "D1";
		S[3][1] = "D2";
		S[3][2] = "D3";
		S[3][3] = "D4";
		S[3][4] = "D5";

		System.out.println(S[3][2]);

		System.out.println();

		for (int Row = 0; Row < S.length; Row++) { // Row // 0<4 - True

			for (int Col = 0; Col < S[0].length; Col++) { // Col 0<5 - True

				System.out.println(S[Row][Col]); // [0][0] [0][1][0][2][0][3][0][4] ,[1][0][1][1]

			}

		}

	}

}