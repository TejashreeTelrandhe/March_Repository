package Guru99_PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Guru99_BaseClass.Base_Class;

public class Guru99_EditCustomer extends Base_Class{

	@FindBy(xpath = "//a[text()=\"Edit Customer\"]")
	WebElement EditCustomer;

	@FindBy(xpath = "//p[@class=\"heading3\"]")
	WebElement Heading;

	@FindBy(name = "cusid")
	WebElement CustomerId;

	@FindBy(name = "AccSubmit")
	WebElement Submit;

	public Guru99_EditCustomer() {
		PageFactory.initElements(driver, this);
	}

	public void clickEditCustomer() {
		EditCustomer.click();
	}

	public void verifyHeading() {
		System.out.println(Heading.getText());
	}

	public void setCustomerId() {
		CustomerId.sendKeys("42233");
	}

	public void clickSubmit() {
		Submit.click();
	}
}
