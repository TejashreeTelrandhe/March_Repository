package LogicalProgram;

public class MaxArray {
	public static void main(String[] args) {
		// Max Array

		int arr[] = { 11, 44, 88, 55, 22, 66 };

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
