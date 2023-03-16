package Guru99_PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Guru99_BaseClass.Base_Class;

public class Guru99_FundTransfer extends Base_Class {
	@FindBy(xpath = "//a[text()=\"Fund Transfer\"]")
	WebElement FundTransfer;

	@FindBy(xpath = "//p[@class=\"heading3\"]")
	WebElement Heading;

	@FindBy(name = "payersaccount")
	WebElement PayersAccountNo;

	@FindBy(name = "payeeaccount")
	WebElement PayeesAccountNo;

	@FindBy(name = "ammount")
	WebElement Amount;

	@FindBy(name = "desc")
	WebElement Description;

	@FindBy(name = "AccSubmit")
	WebElement Submit;

	public Guru99_FundTransfer() {
		PageFactory.initElements(driver, this);
	}

	public void clickFundTransfer() {
		FundTransfer.click();
	}

	public void verifyHeading() {
		System.out.println(Heading.getText());
	}

	public void setPayersAccountNo() {
		PayersAccountNo.sendKeys("119397");
	}

	public void setPayeesAccountNo() {
		PayeesAccountNo.sendKeys("119395");
	}

	public void setAmount() {
		Amount.sendKeys("100");
	}

	public void setDescription() {
		Description.sendKeys("Fees");
	}

	public void clickSubmit() {
		Submit.click();
	}
}
