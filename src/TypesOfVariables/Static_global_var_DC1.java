package TypesOfVariables;

public class Static_global_var_DC1 {

	public static void main(String[] args) {
		
		System.out.println(Static_Global_Variable3.age); // Calling class name
		System.out.println(Static_Global_Variable3.name); 

		
//		System.out.println(Non_Static_GV_Different_Class.age);
//		System.out.println(Non_Static_GV_Different_Class.name);
		
		
		Non_Static_GV_Different_Class NV2 =new Non_Static_GV_Different_Class();
		
		System.out.println(NV2.age);
		System.out.println(NV2.name);
	}

}
