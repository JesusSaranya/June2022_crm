package session4;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnKeyboardActions {

	

	WebDriver driver;
	
	By USERNAME = By.xpath("//*[@id=\"username\"]");
	By PASSWORD = By.xpath("//*[@id=\"password\"]");

	@Before
	public void initDriver() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.dell.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void keyboardevent()
	{
		driver.findElement(USERNAME).sendKeys("demo@techfios.com");
		driver.findElement(PASSWORD).sendKeys("abc123");
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
