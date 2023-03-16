package Interface;


public class AdvanceCalaculator implements Calculator, Casio{
public void Add1() {		
		System.out.println("Addition Method");
	}
    @Override
     public void Add() {
	System.out.println("Hello");
    }
	@Override
	public void Sub() {
		System.out.println("Substraction method");
		
	}

	@Override
	public void Mul() {
		System.out.println("Mul Method");
		
	}

	@Override
	public void log() {
	System.out.println("Casio interface :log ");
	}

	@Override
	public void Tan() {
	System.out.println("Casio interfae :Tan");
		
	}
	public void Sin() {
		System.out.println("Advance Cal : Sin");
	}
	
	public void Cos() {
		System.out.println("Advance Cal : Cos");
	}

}