package Abstraction;

public abstract class RBIBank {
	public void credit() {
		System.out.println("RBI -- CreditCard");
	}
	
	public void debit() {
		System.out.println("RBI -- DebitCard");
	}
	
	public abstract void loan();
	
	
}