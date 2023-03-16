package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLight_Border_Background_Method {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement forgot = driver.findElement(By.linkText("Forgotten password?"));

		
		border(email);
		background(email);
		Thread.sleep(3000);
		border(password);
		background(password);
		Thread.sleep(3000);
		border(forgot);
		background(forgot);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		Thread.sleep(3000);
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		WebElement mob = driver.findElement(By.name("reg_email__"));
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		WebElement day = driver.findElement(By.name("birthday_day"));
		WebElement month = driver.findElement(By.name("birthday_month"));
		WebElement year = driver.findElement(By.name("birthday_year"));
		WebElement female = driver.findElement(By.className("_58mt"));
		WebElement male = driver.findElement(By.xpath("//label[text()=\"Male\"]"));
		WebElement custom = driver.findElement(By.xpath("//label[text()=\"Custom\"]"));
		
		border(firstname);
		background(firstname);
		Thread.sleep(3000);
		border(lastname);
		background(lastname);
		Thread.sleep(3000);
		border(mob);
		background(mob);
		Thread.sleep(3000);
		border(pass);
		background(pass);
		Thread.sleep(3000);
		border(day);
		background(day);
		Thread.sleep(3000);
		border(month);
		background(month);
		Thread.sleep(3000);
		border(year);
		background(year);
		Thread.sleep(3000);
		border(female);
		background(female);
		Thread.sleep(3000);
		border(male);
		background(male);
		Thread.sleep(3000);
		border(custom);
		background(custom);
		Thread.sleep(8000);
		driver.quit();
	}

	public static void border(WebElement element) {
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("arguments[0].style.border = '5px solid red'", element);
	}

	public static void background(WebElement element1) {
		JavascriptExecutor JS1 = (JavascriptExecutor) driver;
		JS1.executeScript("arguments[0].style.background = 'pink'", element1);
	}
}
