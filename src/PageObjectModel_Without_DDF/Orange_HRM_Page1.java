package PageObjectModel_Without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orange_HRM_Page1 {

	// 1. Data member/variables should be declared globally with access level
	// private by using @findby annotations.

	@FindBy(xpath = "//input[@name=\"username\"]")
	public WebElement Username;

	// @FindBy- interface //Webelemet username
	// =driver.findelemet(by.xpath(xpathexpresion);

	@FindBy(xpath = "//input[@name=\"password\"]")
	public WebElement Password;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement LoginButton;

	// 2. Initialize within a constructor with access level public using pagefactory

	public Orange_HRM_Page1(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	// 3. Utilize within a method with access level public

	public void UserName() {
		Username.sendKeys("Admin");
	}

	public void Pass() {
		Password.sendKeys("admin123");
	}

	public void LoginButton() {
		LoginButton.click();
	}
}