package TestNG_Program.Simple_Annotation;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExceptionTest {
	WebDriver driver;
	
	@BeforeMethod
	private void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswak\\eclipse-workspace\\AutomationSelenium\\Drivers\\chromedriver(1).exe");
		driver = new ChromeDriver();
	}
	
	//@Test(expectedExceptions = Exception.class)
	@Test(expectedExceptions = NoSuchElementException.class)
	private void amazonLogin() {
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		WebElement item = driver.findElement(By.xpath("(//div[@class=\"p13n-sc-truncate-desktop-type2  p13n-sc-truncated\"])[1]"));
		item.click();
	}
	
	@AfterMethod
	private void browserClose() {
		driver.close();
	}
}
