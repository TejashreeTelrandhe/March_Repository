package AccessSpecifierDiffPackage;

import AccessSpecifier.Sample1;
import AccessSpecifier.Sample3;
import AccessSpecifier.Sample4;
import AccessSpecifier.Sample5;

public class Test extends Sample5 {

	public static void main(String[] args) {

		Sample1 s1 = new Sample1();

		System.out.println(s1.RollNo);

		s1.name();

//		Sample3 s3 =new Sample3();
//		
//		System.out.println(s3.Pinno);
//		s3.demo();

//		Sample4 s4 =new Sample4();
//		
//		System.out.println(s4.No);
//		s4.m1();

		Test t1 = new Test();

		System.out.println(t1.Rollno1);

		t1.m2();
	}

}
