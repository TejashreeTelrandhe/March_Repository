package Keywords;

public class FinalizeMethod {

	public static void main(String[] args) {
		FinalizeMethod b = new FinalizeMethod();
		b.method();
		b = null;
		System.gc();
		/*
		 * The System class contains several useful class fieldsand methods. It cannot
		 * be instantiated.Among the facilities provided by the System classare standard
		 * input, standard output, and error output streams; access to externally
		 * defined properties and environmentvariables; a means of loading files and
		 * libraries; and a utilitymethod for quickly copying a portion of an array.
		 */
	}

	public void method() {
		System.out.println("Method");
	}

	public void finalize() {
		System.out.println("Finalize method");
	}
}
