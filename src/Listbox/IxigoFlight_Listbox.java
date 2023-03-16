package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IxigoFlight_Listbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ixigo.com/flights");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"clear-input ixi-icon-cross\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder=\"Enter city or airport\"]")).click();
		Thread.sleep(3000);

//		List<WebElement> from = driver.findElements(By.xpath("(//div[@class=\"autocompleter-scroll-cntr\"])[1]//div"));
//		System.out.println("Total takeoff airports = " + from.size());
//		for (int i = 0; i < from.size(); i++) {
//			System.out.println(from.get(i).getText());
//			if (from.get(i).getText()
//					.equals("BOM - Mumbai, India\r\n" + "Chhatrapati Shivaji International Airport\r\n"
//							+ "BOM - Mumbai, India\r\n" + "Chhatrapati Shivaji International Airport\r\n"
//							+ "BOM - Mumbai, India\r\n" + "BOM - Mumbai, India\r\n"
//							+ "Chhatrapati Shivaji International Airport")) {
//				from.get(i).click();
//				break;
//			}
//		}
//		List<WebElement> from = driver.findElements(By.xpath(
//				"//div[@class=\"autocompleter-scroll-cntr\"]//div[@class=\"result-row flight-airport u-box-result\"]"));
		List<WebElement> from = driver.findElements(By.xpath(
				"//div[@class=\"autocompleter-scroll-cntr\"]//div[@class=\"result-row flight-airport u-box-result\"]//div"));
		System.out.println("Total takeoff airports = " + from.size());
		for (int i = 0; i < from.size(); i++) {
			System.out.println(from.get(i).getText());
			if (from.get(i).getText()
					.equals("Chhatrapati Shivaji International Airport")) {
				from.get(i).click();
				break;
			}
		}
		System.out.println("------------------------------");
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//input[@placeholder=\"Enter city or airport\"])[2]")).click();
		Thread.sleep(3000);

//		List<WebElement> to = driver.findElements(By.xpath("(//div[@class=\"autocompleter-scroll-cntr\"])[2]//div"));
//		System.out.println("Total landing airports = " + to.size());
//		for (int i = 0; i < to.size(); i++) {
//			System.out.println(to.get(i).getText());
//			if (to.get(i).getText().equals("MAA - Chennai, India\r\n" + "Chennai International Airport\r\n"
//					+ "MAA - Chennai, India\r\n" + "Chennai International Airport\r\n" + "MAA - Chennai, India\r\n"
//					+ "MAA - Chennai, India\r\n" + "Chennai International Airport")) {
//				to.get(i).click();
//				break;
//			}
//		}
		List<WebElement> to = driver.findElements(By.xpath(
				"(//div[@class=\"autocompleter-scroll-cntr\"])[2]//div[@class=\"result-row flight-airport u-box-result\"]//div"));
		System.out.println("Total takeoff airports = " + to.size());
		for (int i = 0; i < to.size(); i++) {
			System.out.println(to.get(i).getText());
			if (to.get(i).getText()
					.equals("Dabolim Airport")) {
				to.get(i).click();
				break;
			}
		}
		System.out.println("------------------------------");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@placeholder=\"Depart\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(
				"((//div[@class=\"rd-container flight-dep-cal extra-bottom rd-container-attachment\"]//div[@class=\"rd-month\"]//tr)[10]//td)[4]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@placeholder=\"Return\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(
				"((//div[@class=\"rd-container flight-ret-cal extra-bottom rd-container-attachment\"]//div[@class=\"rd-month\"]//tr)[4]//td)[6]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//input[@class=\"c-input u-v-align-middle\"])[5]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(
				"//div[@class=\"u-box passanger-class-list flex-container\"]//div[@class=\"number-counter\"]//span[text()=\"2\"]"))
				.click();
//		Thread.sleep(3000);

		driver.findElement(By.xpath(
				"(//div[@class=\"u-box passanger-class-list flex-container\"]//div[@class=\"u-box-result\"])[2]//span[text()=\"Business\"]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()=\"Search\"]")).click();
		Thread.sleep(3000);

//		driver.findElement(By.xpath("")).click();
//		Thread.sleep(3000);
		driver.quit();
	}

}
