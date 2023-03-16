package Guru99_PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Guru99_BaseClass.Base_Class;

public class Guru99_LoginPage extends Base_Class{

	@FindBy(name ="uid")
	WebElement userid;
	
	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement login;
	
	public Guru99_LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void setUserid() {
		userid.sendKeys(User);
	}
	
	public void setPassword() {
		password.sendKeys(Pass);
	}
	
	public void clickLogin() {
		login.click();
	}
	
}
