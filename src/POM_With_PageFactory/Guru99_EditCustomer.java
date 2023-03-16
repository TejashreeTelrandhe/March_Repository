package POM_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99_EditCustomer {

	@FindBy(xpath = "//a[text()=\"Edit Customer\"]")
	WebElement EditCustomer;

	@FindBy(xpath = "//p[@class=\"heading3\"]")
	WebElement Heading;

	@FindBy(name = "cusid")
	WebElement CustomerId;

	@FindBy(name = "AccSubmit")
	WebElement Submit;

	public Guru99_EditCustomer(WebDriver driver) {
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
