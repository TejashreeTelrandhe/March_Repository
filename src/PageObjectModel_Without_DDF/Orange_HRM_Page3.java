package PageObjectModel_Without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orange_HRM_Page3 {
@FindBy(xpath = "(//button[@type=\"button\"])[2])")
private WebElement ClockButton;

@FindBy(xpath = "//textarea[@placeholder=\"Type here\"])")
private WebElement Note;

public Orange_HRM_Page3(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void clock() {
	ClockButton.click();
}
public void note() {
	Note.sendKeys("I have punched it");
}
}