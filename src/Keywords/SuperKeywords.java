package Keywords;

public class SuperKeywords extends ThisKeywords {
	String firstname = "Abhishek";
	String lastname = "Mudholkar";
	char grade = 'D';
	float percent = 94.25f;
	boolean result = true;

	public static void main(String[] args) {
		SuperKeywords ss = new SuperKeywords();
		System.out.println("Same class firstname = " + ss.firstname);
		System.out.println("Same class lastname = " + ss.lastname);
		System.out.println("Same class grade = " + ss.grade);
		System.out.println("Same class percent = " + ss.percent);
		System.out.println("Same class result = " + ss.result);
		System.out.println();
		ss.class3();
		
	}
public void class3() {
	System.out.println("Super class firstname = " + super.firstname);
	System.out.println("Super class lastname = " + super.lastname);
	System.out.println("Super class grade = " + super.grade);
	System.out.println("Super class percent = " + super.percent);
	System.out.println("Super class result = " + super.result);
	
}
}
