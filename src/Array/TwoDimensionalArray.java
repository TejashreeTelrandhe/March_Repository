package Array;

import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		Object arr[][] = { { 1, 2, 3, 4, 5 }, { "Selenium", "TestNg", "Maven", "Jenkins", "GitHub" } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
