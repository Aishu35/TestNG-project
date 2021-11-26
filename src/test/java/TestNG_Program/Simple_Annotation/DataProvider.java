package TestNG_Program.Simple_Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider{
	
	@Test(dataProvider = "loginCredentials")
	private void instaaLogin(String username, String password) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswak\\eclipse-workspace\\Simple_Annotation\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys(username);
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys(password);
	}
	
	@org.testng.annotations.DataProvider
	private Object[][] loginCredentials() {
		return new Object[][]
				{
					{"AAA", "111"}, {"BBB", "222"}, {"CCC", "333"}
				};
	}
}

	
