package LogicalProgram;

public class DuplicateNumber {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 4, 5, 2, 3, 3, 10, 14, 4 };

		System.out.println(arr.length);

		System.out.println("Duplicate elements in given array");
		// 0<10 - True
		// 1<10- - true
		for (int i = 0; i < arr.length; i++) { // Outer lopp
			// 1<10 - True
			// 2<10 -true
			//
			for (int j = i + 1; j < arr.length; j++) {// inner loop
				// 1==2 - false
				// 1==4 - false
				// 2==4 -false
				// 2==2 - true
				if (arr[i] == arr[j]) {

					System.out.print(arr[j] + " "); // 2
				}
			}
		}
	}

}