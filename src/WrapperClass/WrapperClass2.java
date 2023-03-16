package WrapperClass;

public class WrapperClass2 {

	public static void main(String[] args) {
		String Value1 = "200";
		String Value2 = "300";
		
		//int result = Value1+Value2; 
		
		System.out.println(Value1+Value2); //

		
		int V1=Integer.parseInt(Value1);
		
		int V2= Integer.parseInt(Value2);
		
		int sum = V1+V2;
		
		System.out.println(sum);
		
		if(sum==500) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
				
		}
	}
}