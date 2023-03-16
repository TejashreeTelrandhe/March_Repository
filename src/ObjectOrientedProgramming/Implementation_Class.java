package ObjectOrientedProgramming;

public class Implementation_Class implements Interface_1, Interface_2 {

	public static void main(String[] args) {
		Interface_1 I1 = new Implementation_Class();
		I1.coin();
		I1.console();
		I1.support();
		System.out.println();
		
		Interface_2 I2 = new Implementation_Class();
		I2.invite();
		I2.keywordshortcut();
		I2.tourkite();
		System.out.println();
		
		Implementation_Class IC =new Implementation_Class();
		IC.coin();
		IC.console();
		IC.invite();
		IC.keywordshortcut();
		IC.support();
		IC.tourkite();
	}

	@Override
	public void keywordshortcut() {
		System.out.println("Keyword Shortcut");
	}

	@Override
	public void tourkite() {
		System.out.println("Tour Kite");
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

	@Override
	public void invite() {
		System.out.println("Invite");
	}

}
