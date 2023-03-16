package Array;

public class TwoDimensionalStringArray {

	public static void main(String[] args) {
		String arr[][] = { { "One", "Two", "Three", "Four", "Five" },
				{ "File", "Edit", "Source", "Refactor", "Navigate" } };
		System.out.println("Length of row = "+arr.length);
		System.out.println("Length of column = "+arr[0].length);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				
				System.out.println(arr[i][j]);
			}
		}
		System.out.println();
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[0][3]);
		System.out.println(arr[0][4]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		System.out.println(arr[1][3]);
		System.out.println(arr[1][4]);
	}

}
