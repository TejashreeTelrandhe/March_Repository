package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99_LoginPage_DDF {

	@FindBy(name ="uid")
	WebElement userid;
	
	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement login;
	
	public Guru99_LoginPage_DDF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setUserid(String USERID) {
		userid.sendKeys(USERID);
	}
	
	public void setPassword(String PASSWORD) {
		password.sendKeys(PASSWORD);
	}
	
	public void clickLogin() {
		login.click();
	}
	
}
