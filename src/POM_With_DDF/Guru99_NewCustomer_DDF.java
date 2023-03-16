package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99_NewCustomer_DDF {
	@FindBy(xpath = "//marquee[@class=\"heading3\"]")
	WebElement Heading;

	@FindBy(xpath = "//a[text()=\"New Customer\"]")
	WebElement NewCustomer;

	@FindBy(name = "name")
	WebElement Customername;

	@FindBy(xpath = "(//input[@name=\"rad1\"])[2]")
	WebElement Gender;

	@FindBy(name = "dob")
	WebElement Dateofbirth;

	@FindBy(name = "addr")
	WebElement Address;

	@FindBy(name = "city")
	WebElement City;

	@FindBy(name = "state")
	WebElement State;

	@FindBy(name = "pinno")
	WebElement Pin;

	@FindBy(name = "telephoneno")
	WebElement Mobilenumber;

	@FindBy(name = "emailid")
	WebElement Email;

	@FindBy(name = "password")
	WebElement Password;

	@FindBy(name = "sub")
	WebElement Submit;

	public Guru99_NewCustomer_DDF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyHeading() {
		System.out.println(Heading.getText());
	}

	public void clickNewCustomer() {
		NewCustomer.click();
	}

	public void setCustomername(String CUSTOMERNAME) {
		Customername.sendKeys(CUSTOMERNAME);
	}

	public void clickGender() {
		Gender.click();
	}

	public void setDateofbirth(String DD, String MM, String YYYY) {
		Dateofbirth.sendKeys("08");
		Dateofbirth.sendKeys("02");
		Dateofbirth.sendKeys("1999");
	}

	public void setAddress(String ADDRESS) {
		Address.sendKeys(ADDRESS);
	}

	public void setCity(String CITY) {
		City.sendKeys(CITY);
	}

	public void setState(String STATE) {
		State.sendKeys(STATE);
	}

	public void setPIN(String PIN) {
		Pin.sendKeys(PIN);
	}

	public void setMobilenumber(String MOB) {
		Mobilenumber.sendKeys(MOB);
	}

	public void setEmail(String EMAIL) {
		Email.sendKeys(EMAIL);
	}
	public void setPassword(String PASSWORD) {
		Password.sendKeys(PASSWORD);
	}
	public void clickSubmit() {
		Submit.click();
	}
}
