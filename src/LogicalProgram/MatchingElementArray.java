package LogicalProgram;

public class MatchingElementArray {
public static void main(String[] args) {
//	Matching elements in the array

	int arr [] = {1,2,3,4,5,6,1,4,3};

	for(int i =0;i<arr.length;i++){

	for(int j = i+1;j<arr.length;j++){

	if(arr[i] == arr[j]){

	System.out.println(arr[i]);
	}
	}
}
}
}