package Guru99_PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Guru99_BaseClass.Base_Class;

public class Guru99_MiniStatement extends Base_Class{
	@FindBy(xpath = "//a[text()=\"Mini Statement\"]")
	WebElement MiniStatement;

	@FindBy(xpath = "//p[@class=\"heading3\"]")
	WebElement Heading;

	@FindBy(name = "accountno")
	WebElement AccountNo;

	@FindBy(name = "AccSubmit")
	WebElement Submit;

	public Guru99_MiniStatement() {
		PageFactory.initElements(driver, this);
	}

	public void clickMiniStatement() {
		MiniStatement.click();
	}

	public void verifyHeading() {
		System.out.println(Heading.getText());
	}

	public void setAccountNo() {
		AccountNo.sendKeys("119087");
	}

	public void clickSubmit() {
		Submit.click();
	}
}
