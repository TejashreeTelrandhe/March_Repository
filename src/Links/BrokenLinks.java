package Links;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);

//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		System.out.println("Total number of links = " + links.size());
//
//		int brokenlinks = 0;
//		for (WebElement element : links) {
////			System.out.println(element.getText());
////			System.out.println(element.getAttribute("href"));
//			String url = element.getAttribute("href");
//			if (url == null || url.isEmpty()) {
//				System.out.println("URL is null or empty");
//				continue;
//			}
//			URL link = new URL(url);
//
//			HttpsURLConnection httpcode = (HttpsURLConnection) link.openConnection();
//			httpcode.connect();
//
//			if (httpcode.getResponseCode() >= 400) {
//				System.out.println(httpcode.getResponseCode() + "---->" + url + "is ---->" + " Broken links");
//				brokenlinks++;
//			} else {
//				System.out.println(httpcode.getResponseCode() + "---->" + url + "is ---->" + " Valid links");
//			}
//		}
//		System.out.println("Number of broken links = " + brokenlinks);

		List<WebElement> Links = driver.findElements(By.tagName("a"));

		System.out.println(Links.size());

		int brokenlinks = 0;

		for (WebElement element : Links) {
			String url = element.getAttribute("href");
			if (url == null || url.isEmpty()) {
				System.out.println("URL is null or empty");
				continue;
			}

			URL link = new URL(url);
			HttpsURLConnection httpcode = (HttpsURLConnection) link.openConnection();
			httpcode.connect();

			if (httpcode.getResponseCode() >= 400) {
				System.out.println(httpcode.getResponseCode() + "---->" + url + "  is ---->" + "Broken Links");
				brokenlinks++; // 1
			} else {
				System.out.println(httpcode.getResponseCode() + "---->" + url + "Is ---->" + "Valid Links");

			}

		}
		System.out.println("Number of broken links :" + brokenlinks);
		Thread.sleep(8000);
		driver.quit();
	}
}
