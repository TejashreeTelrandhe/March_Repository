package Guru99_PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Guru99_BaseClass.Base_Class;

public class Guru99_Deposit extends Base_Class {
	@FindBy(xpath = "//a[text()=\"Deposit\"]")
	WebElement Deposit;

	@FindBy(xpath = "//p[@class=\"heading3\"]")
	WebElement Heading;

	@FindBy(name = "accountno")
	WebElement AccountNo;

	@FindBy(name = "ammount")
	WebElement Amount;

	@FindBy(name = "desc")
	WebElement Description;

	@FindBy(name = "AccSubmit")
	WebElement Submit;

	public Guru99_Deposit() {
		PageFactory.initElements(driver, this);
	}

	public void clickDeposit() {
		Deposit.click();
	}

	public void verifyHeading() {
		System.out.println(Heading.getText());
	}

	public void setAccountNo() {
		AccountNo.sendKeys("119088");
	}

	public void setAmount() {
		Amount.sendKeys("3000");
	}

	public void setDescription() {
		Description.sendKeys("Fees");
	}

	public void clickSubmit() {
		Submit.click();
	}
}
