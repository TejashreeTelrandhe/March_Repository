package Guru99_PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Guru99_BaseClass.Base_Class;

public class Guru99_CustomisedStatement extends Base_Class {
	@FindBy(xpath = "//a[text()=\"Customised Statement\"]")
	WebElement CustomisedStatement;

	@FindBy(xpath = "//p[@class=\"heading3\"]")
	WebElement Heading;

	@FindBy(name = "accountno")
	WebElement AccountNo;

	@FindBy(name = "fdate")
	WebElement FromDate;

	@FindBy(name = "tdate")
	WebElement ToDate;

	@FindBy(name = "amountlowerlimit")
	WebElement MinimumTransactionValue;

	@FindBy(name = "numtransaction")
	WebElement NumberofTransaction;

	@FindBy(name = "AccSubmit")
	WebElement Submit;

	public Guru99_CustomisedStatement() {
		PageFactory.initElements(driver, this);
	}

	public void clickCustomisedStatement() {
		CustomisedStatement.click();
	}

	public void verifyHeading() {
		System.out.println(Heading.getText());
	}

	public void setAccountNo() {
		AccountNo.sendKeys("119087");
	}

	public void setFromDate() {
		FromDate.sendKeys("05");
		FromDate.sendKeys("05");
		FromDate.sendKeys("2020");
	}

	public void setToDate() {
		ToDate.sendKeys("03");
		ToDate.sendKeys("09");
		ToDate.sendKeys("2023");
	}

	public void setMinimumTransactionValue() {
		MinimumTransactionValue.sendKeys("500");
	}

	public void setNumberofTransaction() {
		NumberofTransaction.sendKeys("3");
	}

	public void clickSubmit() {
		Submit.click();
	}

}
