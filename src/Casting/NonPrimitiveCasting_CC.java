package Casting;

public class NonPrimitiveCasting_CC extends NonPrimitiveCasting_PC {

	public static void main(String[] args) {
		NonPrimitiveCasting_PC C1 = new NonPrimitiveCasting_PC();//Static binding
		C1.constructor(); //Constructor
		C1.member(); //Member
		C1.scope(); //Scope
		System.out.println();

		NonPrimitiveCasting_CC C2 = new NonPrimitiveCasting_CC();//Static binding
		C2.datatype(); //Datatype
		C2.method(); //Method
		C2.variable(); //Variable
		C2.constructor();//Default Constructor
		System.out.println();

		NonPrimitiveCasting_PC C3 = new NonPrimitiveCasting_CC();//Upcasting //Dynamic binding
		// Upcasting : Assigning subclass property into superclass
		C3.constructor();//Constructor
		C3.member();//Member
		C3.scope();//Scope
		System.out.println();

		NonPrimitiveCasting_CC C4 = (NonPrimitiveCasting_CC) new NonPrimitiveCasting_PC();
        // Downcasting : Assigning superclass property into subclass
		C4.variable();
		C4.constructor();
		C4.datatype();
		C4.member();
		C4.method();
		C4.scope();
	}

	public void datatype() {
		System.out.println("Datatype");
	}

	public void variable() {
		System.out.println("Variable");
	}

	public void method() {
		System.out.println("Method");
	}

	public void constructor() {
		System.out.println("Default Constructor");
	}
}
