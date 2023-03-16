package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		WebElement email = driver.findElement(By.id("email"));
		JS.executeScript("arguments[0].value='tejashreetelrandhe@gmail.com'", email);
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id("pass"));
		JS.executeScript("arguments[0].value='tejashree99'", password);
		Thread.sleep(2000);

//		WebElement forgot = driver.findElement(By.linkText("Forgotten password?"));
//		JS.executeScript("arguments[0].click()",forgot );
//		Thread.sleep(2000);
		
		WebElement NewAccount = driver.findElement(By.xpath("//a[text()=\"Create new account\"]"));
		JS.executeScript("arguments[0].click()", NewAccount);
		Thread.sleep(2000);

		WebElement firstname = driver.findElement(By.name("firstname"));
		JS.executeScript("arguments[0].value='Tejashree'", firstname);
		Thread.sleep(2000);
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		JS.executeScript("arguments[0].value='Telrandhe'", lastname);
		Thread.sleep(2000);
		
		WebElement mob = driver.findElement(By.name("reg_email__"));
		JS.executeScript("arguments[0].value='tejashreetelrandhe@gmail.com'", mob);
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		JS.executeScript("arguments[0].value='tejashree@99'", pass);
		Thread.sleep(2000);
		
//		WebElement day = driver.findElement(By.name("birthday_day"));
//		JS.executeScript("arguments[0].click()", day);
//		Thread.sleep(2000);
		
//		WebElement day8 = driver.findElement(By.xpath("//select[@id=\"day\"]//option[8]"));
//		JS.executeScript("arguments[0].click()", day8);
//		Thread.sleep(2000);
//		
//		WebElement month = driver.findElement(By.name("birthday_month"));
//		JS.executeScript("arguments[0].click()", month);
//		Thread.sleep(2000);
//		
//		WebElement month2 = driver.findElement(By.xpath("//select[@id=\"month\"]//option[2]"));
//		JS.executeScript("arguments[0].click()", month2);
//		Thread.sleep(2000);
//		
//		WebElement year = driver.findElement(By.name("birthday_year"));
//		JS.executeScript("arguments[0].click()", year);
//		Thread.sleep(2000);
//		
//		WebElement year1999 = driver.findElement(By.xpath("//select[@id=\"year\"]//option[25]"));
//		JS.executeScript("arguments[0].click()", year1999);
//		Thread.sleep(2000);
		
		WebElement female = driver.findElement(By.className("_58mt"));
		JS.executeScript("arguments[0].click()", female);
		Thread.sleep(2000);
		
		WebElement male = driver.findElement(By.xpath("//label[text()=\"Male\"]"));
		JS.executeScript("arguments[0].click()", male);
		Thread.sleep(2000);
		
		WebElement custom = driver.findElement(By.xpath("//label[text()=\"Custom\"]"));
		JS.executeScript("arguments[0].click()", custom);
		Thread.sleep(8000);
		driver.quit();
	}

}
