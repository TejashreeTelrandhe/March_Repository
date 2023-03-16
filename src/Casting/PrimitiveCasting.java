package Casting;

public class PrimitiveCasting {

	public static void main(String[] args) {
// Implicit / Widening casting
//		Converting lower datatype into higher datatype
		int a  = 50;
		System.out.println(a);
		double d =a;
		System.out.println(d);
		
//	Explicit / Narrowing casting
//		Converting higher datatype into lower datatype
		double d1 = 56.287;
		System.out.println(d1);
		int i1 = (int) d1;
		System.out.println(i1);
		
//		Boolean / Incompatibility casting
//		Unique type of datatype 
		boolean b = true;
		
		
	}

}
