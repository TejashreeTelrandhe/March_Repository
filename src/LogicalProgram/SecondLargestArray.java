package LogicalProgram;

public class SecondLargestArray {
	public static void main(String[] args) {
//	Second largest array
		int arr[] = { 11, 44, 88, 55, 22, 66, 87, 54, 65 };

		int largest = arr[0];

		int seclargest = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {

				seclargest = largest;

				largest = arr[i];

			} 
			else if (arr[i] > seclargest) {

				seclargest = arr[i];
			}
		}
		System.out.println(seclargest);
	}
}
