package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_CssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		System.out.println("Tagname and value of class attribute");
//		driver.findElement(By.CssSelector("Tagname.value of class attribute"));

		driver.findElement(By.cssSelector("a.private-link.uiLinkWithoutUnderline.m-left-1.uiLinkDark")).click();

		System.out.println("Tagname and value of id attribute");
//		driver.findElement(By.CssSelector("Tagname #value of id attribute"));
		driver.findElement(By.cssSelector("a#hs-eu-confirmation-button")).click();
		driver.findElement(By.cssSelector("input#UIFormControl-2")).sendKeys("Tejashree");
		driver.findElement(By.cssSelector("input#UIFormControl-4")).sendKeys("Telrandhe");
		driver.findElement(By.cssSelector("input#UIFormControl-6")).sendKeys("tejashreetelrandhe1999@gmail.com");

//		driver.findElement(By.CssSelector("Tagname.value of class attribute"));
		System.out.println(
				driver.findElement(By.cssSelector("span.UIFormControl__StyledSpan-sc-1dcek2b-2.hcrfUc")).getText());
		
		System.out.println("Tagname and attribute");
//		driver.findElement(By.CssSelector("Tagname[Attribute=value]"));
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.cssSelector(
				"h3[class=\"Heading-y4nwjw-0 H3-sc-1ilgs1m-0 StepSubtitle__StyledStepSubtitle-awd8z4-0 bIjUCH\"]"))
				.getText());
		
		System.out.println("Tagname,class & attribute");
//		driver.findElement(By.CssSelector("Tagname.class[Attribute=value]"));
		System.out.println(driver.findElement(By.cssSelector("span.UIFormControl__StyledSpan-sc-1dcek2b-2.hcrfUc[class=\"UIFormControl__StyledSpan-sc-1dcek2b-2 hcrfUc\"]")).getText());

		System.out.println("Substring matches");
//		driver.findElement(By.CssSelector("Tagname[attribute^= prefix of the string]"));
		System.out.println(driver.findElement(By.cssSelector("a[class^=\"private-link uiLinkWithoutUnderline TextInputstyles\"]")).getText());
		
		Thread.sleep(3000);
		driver.quit();
	}

}
