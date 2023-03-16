package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLight_Background {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		JavascriptExecutor JS = (JavascriptExecutor) driver;
		WebElement email = driver.findElement(By.id("email"));
		JS.executeScript("arguments[0].style.background = 'red'", email);
		Thread.sleep(3000);

		WebElement password = driver.findElement(By.id("pass"));
		JS.executeScript("arguments[0].style.background = 'yellow'", password);
		Thread.sleep(3000);

		WebElement forgot = driver.findElement(By.linkText("Forgotten password?"));
		JS.executeScript("arguments[0].style.background = 'blue'", forgot);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		Thread.sleep(3000);

		WebElement firstname = driver.findElement(By.name("firstname"));
		JS.executeScript("arguments[0].style.background = 'green'", firstname);
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		JS.executeScript("arguments[0].style.background = 'green'", lastname);
		
		WebElement mob = driver.findElement(By.name("reg_email__"));
		JS.executeScript("arguments[0].style.background = 'orange'", mob);
				
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		JS.executeScript("arguments[0].style.background = 'orange'", pass);
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		JS.executeScript("arguments[0].style.background = 'pink'", day);
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		JS.executeScript("arguments[0].style.background = 'pink'", month);
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		JS.executeScript("arguments[0].style.background = 'pink'", year);
		
		WebElement female = driver.findElement(By.className("_58mt"));
		JS.executeScript("arguments[0].style.background = 'blue'", female);
		
		WebElement male = driver.findElement(By.xpath("//label[text()=\"Male\"]"));
		JS.executeScript("arguments[0].style.background = 'blue'", male);
		
		WebElement custom = driver.findElement(By.xpath("//label[text()=\"Custom\"]"));
		JS.executeScript("arguments[0].style.background = 'blue'", custom);
		
		Thread.sleep(8000);
		driver.quit();
	}

}
