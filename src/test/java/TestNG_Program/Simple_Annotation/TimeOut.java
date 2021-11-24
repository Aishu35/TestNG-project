package TestNG_Program.Simple_Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TimeOut{
	WebDriver driver;
	
	@Test(timeOut = 20000)
	private void amazonPage() throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswak\\eclipse-workspace\\AutomationSelenium\\Drivers\\chromedriver(1).exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement category = driver.findElement(By.xpath("//select[contains(@class,'nav-search-dropdown')]"));
		category.click();
		Select s = new Select(category);
		s.selectByVisibleText("Amazon Devices");
		WebElement search = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		search.click();
		System.out.println("Dropdown Amazon Devices selected and page displayed");
		driver.quit();
		Thread.sleep(2000);
	}

	@Test(timeOut = 15000)
	private void flipkartPage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswak\\eclipse-workspace\\AutomationSelenium\\Drivers\\chromedriver(1).exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		Thread.sleep(2000);
	}

	@Test(timeOut = 15000)
	private void myntraPage() throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswak\\eclipse-workspace\\AutomationSelenium\\Drivers\\chromedriver(1).exe");
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		Thread.sleep(2000);
	}
}
