package TestNG_Program.Simple_Annotation;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	WebDriver driver;
	
	@Test
	 private void loginAmazon() throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("//Drivers//chromedriver.exe"));
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		System.out.println("Amazon page launched successfully");
		Thread.sleep(2000);
	}
	
	@Test
	private void instaLogin() throws Throwable{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("//Drivers//chromedriver.exe"));
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		System.out.println("Instagram launched successfully");
		Thread.sleep(2000);
	}
}
