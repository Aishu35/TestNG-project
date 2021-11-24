package TestNG_Program.Simple_Annotation;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ignore {
	public WebDriver driver;
	
	@Test
	private void amazonLogin() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswak\\eclipse-workspace\\AutomationSelenium\\Drivers\\chromedriver_new.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		WebElement item =  driver.findElement(By.id("twotabsearchtextbox"));
		item.sendKeys("Laptops");
		WebElement submit = driver.findElement(By.xpath("(//input[@type=\"submit\"])[1]"));
		submit.click();
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scrFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\aiswak\\eclipse-workspace\\Simple_Annotation\\Screenshots\\img.png");
		Thread.sleep(2000);
		try {
			FileUtils.copyFile(scrFile, destFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Thread.sleep(2000);
		System.out.println("Screenshot taken successfully");
		driver.quit();
	}
	
	@org.testng.annotations.Ignore
	@Test
	private void myntraLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswak\\eclipse-workspace\\AutomationSelenium\\Drivers\\chromedriver_new.exe");
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}
	
	@Test(enabled = false)
	private void flipkartLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswak\\eclipse-workspace\\AutomationSelenium\\Drivers\\chromedriver_new.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}
	
	@Test
	private void instaLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswak\\eclipse-workspace\\AutomationSelenium\\Drivers\\chromedriver_new.exe");
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}
}
