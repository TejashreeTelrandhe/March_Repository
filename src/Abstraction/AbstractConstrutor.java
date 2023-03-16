package Abstraction;

public abstract class AbstractConstrutor {
	public AbstractConstrutor() {
		this(200);
		System.out.println("Abstract class constructor");
	}

	private AbstractConstrutor(int i) {

		System.out.println("Private Constructor");
	}

}