package Arrays;

public class ArraySum {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 4, 5, 6, 7, 9 };

		int sum = 0;

		for (int i = 0; i < arr.length; i++) { // 0<5,1<5,

			sum = sum + arr[i]; // 0 = 0+1 - 1
								// 1 = 1+3 - 4
								// 4 = 4+4 - 8

			System.out.println(sum);
		}

		System.out.println("Sum of all the lement :" + sum);

	}

}