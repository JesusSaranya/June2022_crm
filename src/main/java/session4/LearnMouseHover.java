package session4;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {

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
	public void mousehoverover()
	{
		
		/*Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Products')]"))).build().perform();
		driver.findElement(By.xpath("//a[text()='Networking']")).click();*/
		
		//span[contains(text(),'Products')]
		//button[@class="mh-mobile-nav-toggle"]
		//By.linkText(All Monitors);
		
		WebElement ProductElement =driver.findElement(By.xpath("//span[contains(text(),'Products')]"));
		WebElement MonitorsElement =driver.findElement(By.xpath("//button[text()='Monitors']"));
		WebElement AllMonitorsElement =driver.findElement(By.xpath("//a[text()=\"View All Monitors\"]"));  
		
		Actions act =new Actions(driver);
		act.moveToElement(ProductElement).build().perform();
		act.moveToElement(MonitorsElement).build().perform();
		AllMonitorsElement.click();
		
		Assert.assertEquals("page not found", "Monitors & Monitor Accessories | Dell USA", driver.getTitle());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
