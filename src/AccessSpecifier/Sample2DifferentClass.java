package AccessSpecifier;
public class Sample2DifferentClass {

	public static void main(String[] args) {

		Sample1 s1 = new Sample1();
		
		System.out.println(s1.RollNo);
		
		s1.name();
		
		
//		Sample3 s3 =new Sample3();
//		
//		System.out.println(s3.Pinno);
//		s3.demo();
		 
		Sample4 s4 = new Sample4();
		System.out.println(s4.No);
		s4.m1();
		
		Sample5 s5 =new Sample5();
		System.out.println(s5.Rollno1);
		s5.m2();
		
	}

}