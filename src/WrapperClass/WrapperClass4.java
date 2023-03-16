package WrapperClass;

public class WrapperClass4 {

	public static void main(String[] args) {

		// Boxing and unboxing

		// Unboxing - When we convert object of wrapper class to its respective
		// primitive data type

		// Unboxing
		Integer Mark = 200;
		int UpdateMark = Mark.intValue();
		System.out.println("Unboxing :" + UpdateMark);

		System.out.println();

		// boxing
		int Data = 300;
		Integer NewData = Integer.valueOf(Data);
		System.out.println(NewData);
		System.out.println();

		// Autoboxing

		int a = 20;
		Integer b = a;
		System.out.println(b);

		System.out.println();
		
		// AutoUnboxing
		Integer Result = 65;

		int Marks1 = Result;
		System.out.println(Marks1);
	}

}