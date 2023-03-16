package Interface;

public class HSBCBank implements RBIBank, USBank, BrazilBank {

	@Override
	public void Credit() {

		System.out.println(minBalance);
		System.out.println("HSBCBank -- Credit");
	}

	@Override
	public void Debit() {
		System.out.println("HSBCBank -- Debit ");
	}

	@Override
	public void TransferMoney() {
		System.out.println("HSBCBank -- TransferMoney ");
	}

	@Override
	public void BikeLoan() {
		System.out.println("HSBCBank -- BikeLoan ");

	}

	@Override
	public void PersonalLoan() {
		System.out.println("HSBCBank -- PersonlLoan ");

	}

	@Override
	public void MutualFunds() {
		System.out.println("HSBCBank -- MutualFunds ");

	}

	@Override
	public void CarLoan() {
		System.out.println("HSBCBank -- CarLoan ");

	}

	public void HomeLoan() {
		System.out.println("HSBCBank -- HomeLoan");
	}

	public static void main(String[] args) {

		HSBCBank HB = new HSBCBank(); // Static

		HB.Credit();
		HB.Debit();
		HB.TransferMoney();
		System.out.println(HB.minBalance);

		HB.BikeLoan();
		HB.PersonalLoan();

		HB.MutualFunds();
		HB.CarLoan();

		HB.HomeLoan();

		System.out.println("-----------------------------------");
		RBIBank RB = new HSBCBank(); // Dynamic

		RB.Credit();
		RB.Debit();
		RB.TransferMoney();
		System.out.println(RB.minBalance);

		USBank UB = new HSBCBank();

		UB.BikeLoan();
		UB.PersonalLoan();

		// BrazilBank RB1 =new BrazilBank();

		BrazilBank BB = new HSBCBank();

		BB.MutualFunds();

		BB.CarLoan();

	}

}
