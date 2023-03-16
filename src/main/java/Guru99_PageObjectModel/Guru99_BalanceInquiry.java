package Guru99_PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Guru99_BaseClass.Base_Class;

public class Guru99_BalanceInquiry extends Base_Class {
	@FindBy(xpath = "//a[text()=\"Balance Enquiry\"]")
	WebElement BalanceEnquiry;

	@FindBy(xpath = "//p[@class=\"heading3\"]")
	WebElement Heading;

	@FindBy(name = "accountno")
	WebElement AccountNo;

	@FindBy(name = "AccSubmit")
	WebElement Submit;

	public Guru99_BalanceInquiry() {
		PageFactory.initElements(driver, this);
	}

	public void clickBalanceEnquiry() {
		BalanceEnquiry.click();
	}

	public void verifyHeading() {
		System.out.println(Heading.getText());
	}

	public void setAccountNo() {
		AccountNo.sendKeys("119397");
	}

	public void clickSubmit() {
		Submit.click();
	}
}
