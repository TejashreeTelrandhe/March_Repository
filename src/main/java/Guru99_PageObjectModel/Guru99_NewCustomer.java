package Guru99_PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Guru99_BaseClass.Base_Class;

public class Guru99_NewCustomer extends Base_Class{
	@FindBy(xpath = "//p[@class=\"heading3\"]")
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

	public Guru99_NewCustomer() {
		PageFactory.initElements(driver, this);
	}

	public void verifyHeading() {
		System.out.println(Heading.getText());
	}

	public void clickNewCustomer() {
		NewCustomer.click();
	}

	public void setCustomername() {
		Customername.sendKeys("Sonal Meshram");
	}

	public void clickGender() {
		Gender.click();
	}

	public void setDateofbirth() {
		Dateofbirth.sendKeys("07");
		Dateofbirth.sendKeys("09");
		Dateofbirth.sendKeys("1993");
	}

	public void setAddress() {
		Address.sendKeys("HDFC Bank Bypass Road");
	}

	public void setCity() {
		City.sendKeys("Nagpur");
	}

	public void setState() {
		State.sendKeys("MH");
	}

	public void setPIN() {
		PIN.sendKeys("441503");
	}

	public void setMobilenumber() {
		Mobilenumber.sendKeys("9987771289");
	}

	public void setEmail() {
		Email.sendKeys("sonalmeshram@gmail.com");
	}
	public void setPassword() {
		Password.sendKeys("meshram23");
	}
	public void clickSubmit() {
		Submit.click();
	}
}
