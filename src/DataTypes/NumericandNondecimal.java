package DataTypes;

public class NumericandNondecimal {

	public static void main(String[] args) {

		// Primitive data type

		// 1. (numeric +non-decimal)

		// Byte data type = -128 to 127

		// syntax = Datatype variable name = information;

		byte b = 50;
		byte b1 = 127; // Max limit
		// byte b2 = 130; // Not allowed

		System.out.println("Byte data type :" + b);
		System.out.println("Byte data type max limit:" + b1);
		System.out.println();

		byte b2 = -30; // allowed
		byte b3 = -128; // Min limit
		// byte b4 = -129; // Not allowed

		System.out.println("Byte data type :" + b2);
		System.out.println("Byte datatype min limit");

		// 2 . Short data type - 2 Byte ( -32768 to 32767)

		// Syntax = DataType Variable name = information

		short S1 = 150;
		short s2 = 1000;
		short s3 = 32767; // Max limit
		// short s4 = 32768; // Not allowed

		System.out.println("Short DT :" + s2);
		System.out.println("Short DT Max value :" + s3);

		short s4 = -500;
		short s5 = -2000;
		short s6 = -32768;

		System.out.println("Short DT :" + s5);
		System.out.println("Short DT Min value :" + s6);

		// 3. int data type - Size 4 Byte = 32 bit
		// Syntax = DataType Variable name = information

		int i1 = 100;
		int i2 = 36000;
		int i3 = 2147483647; // Max limit

		int i4 = -32768;
		int i5 = -327888;
		int i6 = -2147483648; // Min limit

		System.out.println("Int DT :" + i1);
		System.out.println("Int DT :" + i2);
		System.out.println("Int DT Max limit:" + i3);
		
		System.out.println("Int DT :" + i4);
		System.out.println("Int DT :" + i5);
		System.out.println("Int DT Min Limit :" + i6);
		System.out.println();
		
		// 4. Long data Type - 8 byte - 64 bit

		// Syntax = DataType Variable name = information

		long l1 = 844444444;
		long l2 = 8390894321l;
		long l3 = 56747474747474l;
		long l4 = 9223372036854775807l; // Max limit

		long l5 = -443464747;
		long l6 = -9223372036854775808l;

		System.out.println("Long DT :" + l1);
		System.out.println("Long DT :" + l2);
		System.out.println("Long DT :" + l3);
		
		System.out.println("Max Long DT :" + l4);
		System.out.println("Long DT :" + l5);
		System.out.println("Min Long DT :" + l6);
	}
}
