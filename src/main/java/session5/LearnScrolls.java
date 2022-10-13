package session5;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScrolls {

	
	WebDriver driver;

	@Before
	public void initDriver() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void scrollUpDown() throws InterruptedException
	{
		
		/*JavascriptExecutor  js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,700)");
		Thread.sleep(5000);
		js.executeScript("scroll(0,0)");*/
		
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("scroll(0,8000)");
		Thread.sleep(3000);
		js.executeScript("scroll(0,0)");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
