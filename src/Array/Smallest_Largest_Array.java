package Array;

public class Smallest_Largest_Array {

	public static void main(String[] args) {
		System.out.println("Smallest element in Array");
		int arr[] = { 15, 25, 65, 75, 85, 45, 99 };
		int small = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= small) {
				small = arr[i];
				System.out.println(small);
			}
		}
		
		System.out.println("Largest element in Array");
		int array []= {78,25,96,65,96};
		int large = arr[0];
		for(int j =0;j<array.length;j++) {
			if(array[j]>=large) {
				large = array[j];
				System.out.println(large);
			}
		}
	}

}
