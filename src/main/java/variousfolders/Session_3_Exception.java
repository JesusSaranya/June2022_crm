package variousfolders;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Session_3_Exception {
	
	WebDriver driver;
	
	
	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarne\\Selenium\\crm\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void LoginTest()
	{
	     //ELEMENT LIST(WEBELEMENT TYPE)
		WebElement USERNAME_ELEMENT = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement PASSWORD_ELEMENT =driver.findElement(By.xpath("//input[@id='password']"));
		WebElement SIGNIN_BUTTON_ELEMENT = driver.findElement(By.xpath("//button[@name='login']"));
		//WebElement DASHBOARDHEADER_ELEMENT = driver.findElement(By.xpath("//h2[normalize-space()='Dashboard']"));
		
		/*USERNAME_ELEMENT.sendKeys("demo@techfios.com");
		PASSWORD_ELEMENT.sendKeys("abc123");
		SIGNIN_BUTTON_ELEMENT.click();*/
		
		
		//BY  TYPE==========ELEMENT LIST
		By USERNAME_FIELD = By.xpath("//input[@id='username']");
		By PASSWORD_FIELD = By.xpath("//input[@id='password']");
		By SIGNIN_BUTTON_FIELD = By.xpath("//button[@name='login']");
		By DASHBOARDHEADER_FIELD = By.xpath("//h2[contains(text(),'Dashboard')]");
		
		USERNAME_ELEMENT.clear();
		driver.findElement(USERNAME_FIELD).sendKeys("demo@techfios.com");
		driver.findElement(PASSWORD_FIELD).sendKeys("abc123 ");
		driver.findElement(SIGNIN_BUTTON_FIELD).click();
		Assert.assertTrue("page not found", driver.findElement(DASHBOARDHEADER_FIELD).isDisplayed());
		
		
		
	
		//=========== No need///
		/*boolean pageTitleDisplayStatus;
		try
		{
			WebElement dashboardheaderElement = driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"));	
			 pageTitleDisplayStatus = true;
		}
		catch(Exception e)
		{
			pageTitleDisplayStatus = false;
			e.printStackTrace();
		}*/
		//WebDriverWait  wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(DASHBOARDHEADER_FIELD));
		
		//WebElement dashboardheaderElement = driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"));
		//Assert.assertTrue("Dashboard page not found", dashboardheaderElement.isDisplayed());
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
