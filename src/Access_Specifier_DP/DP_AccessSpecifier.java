package Access_Specifier_DP;

import Access_Specifier_SP.DefaultAccessSpecifier;
import Access_Specifier_SP.PrivateAccessSpecifier;
import Access_Specifier_SP.ProtectedAccessSpecifier;
import Access_Specifier_SP.PublicAccessSpecifier;

public class DP_AccessSpecifier {

	public static void main(String[] args) {
		PublicAccessSpecifier p1 = new PublicAccessSpecifier();
		p1.method1();
		p1.method2();
		p1.method3();
		System.out.println();
		PrivateAccessSpecifier P2 = new PrivateAccessSpecifier();
//		P2.method4();
//		P2.method5();
//		P2.method6();
		System.out.println();
		ProtectedAccessSpecifier P3 = new ProtectedAccessSpecifier();
//		P3.method7();
//		P3.method8();
//		P3.method9();
		System.out.println();
		DefaultAccessSpecifier P4 = new DefaultAccessSpecifier();
//		P4.method10();
//		P4.method11();
//		P4.method12();
	}

}
