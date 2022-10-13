package variousfolders;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session2LearnLocators {

	WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
	
		@Test
		public void testLocators()
		{
			
		driver.findElement(By.name("firstname")).sendKeys("Jesus");	
		driver.findElement(By.name("lastname")).sendKeys("Saranya");	
		driver.findElement(By.name("Password")).sendKeys("abc123");	
		
		//CLICK THE RADIO BUTTON
		driver.findElement(By.id("sex-0")).click();
		
		//UPLOAD FILE
		//IF THE TAG IS ANYTHING ELSE THAN INPUT THEN USE ROBOT
		driver.findElement(By.id("photo")).sendKeys("F:\\Desktop - sarne user\\Saranya_QA_CV.docx");
		
		//LINK======USING LINKTEXT METHOD
		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		//driver.findElement(By.partialLinkText("Product FrontEnd")).click();
		
		//CSS SELECTOR
		driver.findElement(By.cssSelector("input#exp-3")).click();
		
		driver.findElement(By.cssSelector("input[id='tool-2']")).click();
		
		driver.findElement(By.cssSelector("a[href$='http://www.objectspy.space']")).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	

