package ObjectOrientedProgramming;

public class ConcreteClass extends AbstractClass {

	public static void main(String[] args) {
		ConcreteClass CC = new ConcreteClass();//Static binding
		CC.coin();
		CC.console();
		CC.keywordshortcut();
		CC.tourkite();
		CC.UserManual();
		CC.support();
		System.out.println(CC.app);
		System.out.println();
		AbstractClass AC = new ConcreteClass(); //Upcasting , Dynamic binding
		AC.coin();
		AC.console();
		AC.keywordshortcut();
		AC.tourkite();
		System.out.println(AC.app);
	}

	@Override
	public void console() {
		System.out.println("Console");
	}

	@Override
	public void coin() {
		System.out.println("Coin");
	}

	@Override
	public void support() {
		System.out.println("Support");
	}

	public void UserManual() {
		System.out.println("User Manual");
	}
}
