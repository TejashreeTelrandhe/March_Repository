package FinalfinallyfinalizeConcept;

public class finalizeConcept {
//finalize is the method in java which is used to perform cleanup processing just before object.

	public static void main(String[] args) {
		finalizeConcept f1 = new finalizeConcept();
		f1.test();

		f1 = null;

		System.gc();
	}

	public void test() {
		System.out.println("Good morning");
	}

	public void finalize() {
		System.out.println("Finalize method executed");
	}

}