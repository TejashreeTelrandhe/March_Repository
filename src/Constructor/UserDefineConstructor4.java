package Constructor;

public class UserDefineConstructor4 {

	String name;
	String model;
	int Price;
	String engine;

	public UserDefineConstructor4(String name1, String model1, int Price1, String engine1) {

		name = name1;
		model = model1;
		Price = Price1;
		engine = engine1;

	}

	public static void main(String[] args) {

		UserDefineConstructor4 UD1 = new UserDefineConstructor4("Kia", "Seltos", 200000, "Automatic");
		UserDefineConstructor4 UD2 = new UserDefineConstructor4("TATA", "Nexon", 150000, "Manual");
		UserDefineConstructor4 UD3 = new UserDefineConstructor4("TATA", "Maruti", 150400, "Auto");

		System.out.println(UD1.name + " " + UD1.model + " " + UD1.Price + " " + UD1.engine);
		System.out.println(UD2.name + " " + UD2.model + " " + UD2.Price + " " + UD2.engine);
		System.out.println(UD3.name + " " + UD3.model + " " + UD3.Price + " " + UD3.engine);

	}

}
