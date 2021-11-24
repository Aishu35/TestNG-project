package TestNG_Program.Simple_Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Grouping {
	public WebDriver driver;
	
	@Test(priority = 0, groups = "youTube")
	private void youtubeLogin() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswak\\eclipse-workspace\\AutomationSelenium\\Drivers\\chromedriver_new.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		WebElement songs = driver.findElement(By.xpath("//input[@name=\"search_query\"]"));
		songs.sendKeys("AR Rahman Hits");
		System.out.println("AR Rahman hit songs");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("(//yt-icon[@class=\"style-scope ytd-searchbox\"])[2]"));
		search.click();
		Thread.sleep(2000);
		WebElement select = driver.findElement(By.xpath("(//yt-formatted-string[@class=\"style-scope ytd-video-renderer\"])[1]"));
		select.click();
		System.out.println("Enjoy your songs");
	}
	
	@Test(priority = 1, groups = "Online Shopping")
	private void myntraLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswak\\eclipse-workspace\\AutomationSelenium\\Drivers\\chromedriver_new.exe");
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}
	
	@Test(priority = 2, groups = "Social Media")
	private void instaLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswak\\eclipse-workspace\\AutomationSelenium\\Drivers\\chromedriver_new.exe");
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}
	
	@Test(priority = 0, groups = "youTube")
	private void youTubeLogin() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswak\\eclipse-workspace\\AutomationSelenium\\Drivers\\chromedriver_new.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		WebElement songs = driver.findElement(By.xpath("//input[@name=\"search_query\"]"));
		songs.sendKeys("Children Rhymes");
		System.out.println("Make your children happy");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("(//yt-icon[@class=\"style-scope ytd-searchbox\"])[2]"));
		search.click();
		Thread.sleep(2000);
		WebElement select = driver.findElement(By.xpath("(//a[@href=\"/watch?v=RciE68Q7PCA\"])[2]"));
		select.click();
		System.out.println("Enjoy the Rhymes");
	}
}
