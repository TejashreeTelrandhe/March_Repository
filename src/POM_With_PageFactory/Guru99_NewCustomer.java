package POM_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99_NewCustomer {
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
	WebElement PIN;

	@FindBy(name = "telephoneno")
	WebElement Mobilenumber;

	@FindBy(name = "emailid")
	WebElement Email;

	@FindBy(name = "password")
	WebElement Password;

	@FindBy(name = "sub")
	WebElement Submit;

	public Guru99_NewCustomer(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyHeading() {
		System.out.println(Heading.getText());
	}

	public void clickNewCustomer() {
		NewCustomer.click();
	}

	public void setCustomername() {
		Customername.sendKeys("Telrandhe T Tejashri");
	}

	public void clickGender() {
		Gender.click();
	}

	public void setDateofbirth() {
		Dateofbirth.sendKeys("08");
		Dateofbirth.sendKeys("02");
		Dateofbirth.sendKeys("1999");
	}

	public void setAddress() {
		Address.sendKeys("Mangalwari Peth Buldhana Urban Bank");
	}

	public void setCity() {
		City.sendKeys("Nagpur");
	}

	public void setState() {
		State.sendKeys("Maharashtra");
	}

	public void setPIN() {
		PIN.sendKeys("441503");
	}

	public void setMobilenumber() {
		Mobilenumber.sendKeys("8805691542");
	}

	public void setEmail() {
		Email.sendKeys("telrandhetejashri99@gmail.com");
	}
	public void setPassword() {
		Password.sendKeys("telrandhe99");
	}
	public void clickSubmit() {
		Submit.click();
	}
}
