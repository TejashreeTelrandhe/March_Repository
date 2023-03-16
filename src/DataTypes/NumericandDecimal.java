package DataTypes;

public class NumericandDecimal {

	public static void main(String[] args) {

		// 1. Float - 4 Byte - 32 bit

        // syntax  = DataType variable name  = Information;

		float f1 = 33.33f;
		float f2 = 444.28282f;

		float f3 = -33.555f;
		float f4 = -4444.43333f;

		System.out.println("Float DT :" + f1);
		System.out.println("Float DT :" + f2);
		System.out.println("Float DT :" + f3);
		System.out.println("Float DT :" + f4);
		System.out.println();

		// We can store int values in float DT but we can not store float value in int DT

		// 2 . Double = 8 Byte - 64 bit

		// syntax = DataType variable name = Information;

		double d1 = 333.333d;
		double d2 = 4444.22444d;

		double d3 = -33333.343d;
		double d4 = -757575.5555d;

		System.out.println("Double DT :" + d1);
		System.out.println("Double DT :" + d2);
		System.out.println("Double DT :" + d3);
		System.out.println("Double DT :" + d4);
	}

}
