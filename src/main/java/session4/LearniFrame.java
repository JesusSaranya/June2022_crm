package session4;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearniFrame {

	
	WebDriver driver;

	@Before
	public void initDriver() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void handlingframe()
	{
		/*driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("java.awt")).click();
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Adjustable")).click();
		driver.switchTo().parentFrame();
		
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//a[contains(text(),'HORIZONTAL')]")).click();*/
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("java.awt")).click();
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Adjustable")).click();
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//div[@class='topNav']//a[contains(text(),'Index')]")).click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
