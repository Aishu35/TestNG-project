package TestNG_Program.Simple_Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Invocation {
	WebDriver driver;
	
	@BeforeMethod
	private void chromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswak\\eclipse-workspace\\AutomationSelenium\\Drivers\\chromedriver(1).exe");
		driver = new ChromeDriver();
	}
	
	@Test(invocationCount = 2, groups = "online shopping")
	private void amazonPage() throws Throwable {
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement category = driver.findElement(By.xpath("//select[contains(@class,'nav-search-dropdown')]"));
		category.click();
		Select s = new Select(category);
		s.selectByVisibleText("Amazon Devices");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		search.click();
		System.out.println("Dropdown Amazon Devices selected and page displayed");
		driver.close();
		Thread.sleep(2000);
	}
	
	@Test(invocationCount = 5,groups = "online shopping")
	private void flipkartPage() throws Throwable {
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		Thread.sleep(2000);
	}
	
	@Test(invocationCount = 3, groups = "online shopping")
	private void myntraPage() throws Throwable {
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	private void browserClose() {
		System.out.println("Website checked and closed the browser");
	}
}
