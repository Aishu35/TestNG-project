package TestNG_Program.Simple_Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Ann {
	public String url = "https://www.amazon.in/";
	public WebDriver driver;
	
	@BeforeSuite
	private void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswak\\eclipse-workspace\\AutomationSelenium\\Drivers\\chromedriver_new.exe");
	}
	
	@BeforeClass
	private void startBrowser() {
		System.out.println("Start the browser setup and open the url");
	}
	
	@Test
	private void browserSetup() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test
	private void searchItem() {
		WebElement item =  driver.findElement(By.id("twotabsearchtextbox"));
		item.sendKeys("office chair");
		WebElement submit = driver.findElement(By.xpath("(//input[@type=\"submit\"])[1]"));
		submit.click();
	}
	
	@AfterClass
	private void urlClose() {
		System.out.println("Closing the URL");
		driver.quit();
	}
	
	@AfterSuite
	private void browserEnd() {
		System.out.println("Browser quits. Bye");
	}
	}
