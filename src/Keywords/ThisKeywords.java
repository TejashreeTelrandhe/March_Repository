package Keywords;

public class ThisKeywords {
	static String firstname = "Tejashree";
	static String lastname ="Telrandhe";
	static char grade = 'A';
	static float percent = 80.25f;
	static boolean result = true;

public static void main(String[] args) {
	ThisKeywords tt = new ThisKeywords();
	System.out.println("class1 firstname = "+firstname);
	System.out.println("class1 lastname = "+lastname);
	System.out.println("class1 grade = "+grade);
	System.out.println("class1 percent = "+percent);
	System.out.println("class1 result = "+result);
	System.out.println();
	tt.class1();
	System.out.println();
	tt.class2();
	}
public void class1() {
	String firstname = "Komal";
	String lastname ="Waghe";
	char grade = 'B';
	float percent = 75.25f;
	boolean result = true;
	
	System.out.println("class1 firstname = "+firstname);
	System.out.println("class1 lastname = "+lastname);
	System.out.println("class1 grade = "+grade);
	System.out.println("class1 percent = "+percent);
	System.out.println("class1 result = "+result);
}
public void class2() {
	String firstname = "Sagar";
	String lastname ="Telrandhe";
	char grade = 'C';
	float percent = 60.20f;
	boolean result = false;
	
	System.out.println("class2 firstname = "+firstname);
	System.out.println("class2 lastname = "+lastname);
	System.out.println("class2 grade = "+grade);
	System.out.println("class2 percent = "+percent);
	System.out.println("class2 result = "+result);
	System.out.println();
	System.out.println("class2 firstname = "+this.firstname);
	System.out.println("class2 lastname = "+this.lastname);
	System.out.println("class2 grade = "+this.grade);
	System.out.println("class2 percent = "+this.percent);
	System.out.println("class2 result = "+this.result);
}
}
