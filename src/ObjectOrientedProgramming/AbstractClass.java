package ObjectOrientedProgramming;

public abstract class AbstractClass {
	String app = "Zerodha";

	public static void main(String[] args) {
//		AbstractClass AC = new AbstractClass();//Object of abstract class cannot be created
//      Cannot instantiate the type AbstractClass
//      System.out.println(AC.app);
	}

	public abstract void console();

	public abstract void coin();

	public abstract void support();

	public void tourkite() {
		System.out.println("Tour kite");
	}

	public void keywordshortcut() {
		System.out.println("Keyword Shortcut");
	}
}
