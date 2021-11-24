package TestNG_Program.Simple_Annotation;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dependency {
	WebDriver driver;
	
	@BeforeMethod
	private void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswak\\eclipse-workspace\\AutomationSelenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test(dependsOnMethods = "instaLogin")
	private void loginAmazon() throws Throwable {
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		WebElement item = driver.findElement(By.xpath("//a[text ()= \"Mobiles\"]"));
		Actions ac = new Actions(driver);
		ac.contextClick(item).perform();
		Thread.sleep(10000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
	}
	
	@Test
	private void instaLogin() throws Throwable {
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(10000);
	}
	
	@AfterMethod
	private void browserClose() {
		driver.quit();
		System.out.println("Browser closed successfully");
	}
}
