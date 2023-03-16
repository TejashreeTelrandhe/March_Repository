package LogicalProgram;

public class MinArray {
public static void main(String[] args) {
//	Min Array 

	int arr [] = { 11, 44, 88, 55, 22, 66 };

	int min=arr[0];

	for(int i =1;i<arr.length;i++){

	if(arr[i]<min){

	min= arr[i];

	}

	}
	System.out.println(min);
}
}
