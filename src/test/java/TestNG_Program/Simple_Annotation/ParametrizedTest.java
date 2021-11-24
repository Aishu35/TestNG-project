package TestNG_Program.Simple_Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizedTest {
	
	@Parameters({"username", "password"})
	@Test
	private void instaLogin(String username, String password) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswak\\eclipse-workspace\\Simple_Annotation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys(username);
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys(password);
	}
	
}
