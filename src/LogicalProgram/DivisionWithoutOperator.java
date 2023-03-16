package LogicalProgram;

public class DivisionWithoutOperator {

	public static void main(String[] args) {
//		Division without operator
		int num1 = 100;

		int num2 = 20;

		int result = 0;

		while(num1 >= num2) { //100>=20

			num1 = num1 - num2; // 100 -20 = 80 

			result++; //0++ 
		}
		
		System.out.println(result);
	}
	
}
