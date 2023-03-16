package TypesOfVariables;

public class Variables1 {

	static String name = "Sachine"; // static variable GV
	   String name1 = "Akash";   // Non static GV
	static    int age  =25;  
	   int age1 =  35;
	
	
	public static void main(String[] args) {
		
		int i = 10;
		System.out.println(i);
		System.out.println(name);
		System.out.println(age);
		
		Variables1  v1 = new Variables1();
		
		System.out.println(v1.name1);
		System.out.println(v1.age1);
		v1.m1();
		
	}
	
	public void m1() {
		
	//	String name1 ="Viraj";
		System.out.println(name);
		System.out.println(name1);
		System.out.println(this.name1); //
		
	}
	
	
	public static void m2() {
		
		int x =20;
		int y =30;
		
		System.out.println(age);
		System.out.println(name);
		
	}

}
