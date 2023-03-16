package WrapperClass;

import java.util.ArrayList;

public class WrapperClass1 {

	public static void main(String[] args) {

		// Wrapper classes are predefine class by java which can contains primitive data
		// type.
		// In simple word we can say wrap a primitive value to wrapper class obj

//		Primitive Type      Wrapper class
//		boolean             Boolean
//		byte                Byte
//		char                Character
//		int                 Integer
//		float               Float
//		long                Long
//		double              Double
//		short               Short     

		// ArrayList<Integer >AL =new ArrayList<Integer>

		int a = 10; // a is a variable which contains a 10 value

		System.out.println("Primitve :" + a);
		Integer b = 20; // b is Reference object variable name
		System.out.println("Wrapper :" + b);
	}

}