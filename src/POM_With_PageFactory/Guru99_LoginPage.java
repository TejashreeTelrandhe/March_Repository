package POM_With_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99_LoginPage {

	@FindBy(name ="uid")
	WebElement userid;
	
	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement login;
	
	public Guru99_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setUserid() {
		userid.sendKeys("mngr472933");
	}
	
	public void setPassword() {
		password.sendKeys("UqEryra");
	}
	
	public void clickLogin() {
		login.click();
	}
	
}
