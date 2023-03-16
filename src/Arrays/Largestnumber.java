package Arrays;

public class Largestnumber {

	public static void main(String[] args) {

		int arr[] = { 3, 4, 55, 22, 66, 99, 1000, 222 };

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {

				max = arr[i];

			}
		}
		System.out.println("Largest number present in given array :" + max);

	}

}