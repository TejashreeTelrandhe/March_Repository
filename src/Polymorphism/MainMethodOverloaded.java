package Polymorphism;

public class MainMethodOverloaded {

	public static void main(String[] args) {

		MainMethodOverloaded MO1 =new MainMethodOverloaded();
		MO1.m1();
		MO1.m2();
		MainMethodOverloaded.main(10);
		
	}
    public static void main(int i) {

    	MainMethodOverloaded MO2 =new MainMethodOverloaded();
		MO2.m1();
		MO2.m2();
		
	}
   
    public static void main(char [] args) {

    	MainMethodOverloaded MO2 =new MainMethodOverloaded();
		MO2.m1();
		MO2.m2();
		
	}
    
    public void m1() {
	  System.out.println("M1 method");
  }
    public void m2() {
	  System.out.println("M2 Methood");
  }
	
}