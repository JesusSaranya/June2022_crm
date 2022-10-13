package session4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDownsession4 {

	
	WebDriver driver;
	
	By USERNAME = By.xpath("//*[@id=\"username\"]");
	By PASSWORD = By.xpath("//*[@id=\"password\"]");
	By LOGIN = By.xpath("//button[@name='login']");
	By DASHBOARD= By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2");
	
	By CUSTOMER = By.xpath("//span[normalize-space()='Customers']");
	By ADDCUSTOMER = By.xpath("//a[contains(text(),'Add Customer')]");  
	By FULLNAME = By.xpath("//input[@id='account']");
	By COMPANYDROPDOWN = By.xpath("//select[@id='cid']");
	
	 
	@Before
	public void initDriver()
	{
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		
	//@Test
	public void loginTest()
	  {
		driver.findElement(USERNAME).sendKeys("demo@techfios.com");
		driver.findElement(PASSWORD).sendKeys("abc123");
		driver.findElement(LOGIN).click();
		
		/*boolean dashboard = driver.findElement(DASHBOARD).isDisplayed();
		Assert.assertTrue("Page not foundation", dashboard);*/
		
		/*String dashboard = driver.findElement(DASHBOARD).getText();
		Assert.assertEquals("page not found", "Dashboard", dashboard);*/
		
		//Assert.assertEquals("Page not found", "Dashboard", driver.findElement(DASHBOARD).getText());
		Assert.assertEquals("Page not found", "Dashboard- iBilling", driver.getTitle());
		
	   }	
		
	 @Test
	public void addcustomer() throws InterruptedException
	  {
		  loginTest();
		  driver.findElement(CUSTOMER).click();
		  driver.findElement(ADDCUSTOMER).click();
		  
		  Assert.assertEquals("page not found", "Contacts - iBilling", driver.getTitle());
		  
		  driver.findElement(FULLNAME).sendKeys("selenium java");
		  Thread.sleep(3000);
		  
		  Select sel = new Select(driver.findElement(COMPANYDROPDOWN));
		  sel.selectByVisibleText("Techfios"); 
		  // get the options from the select tag store them in a variable sting type List
		 List<WebElement> option = sel.getOptions();
		 System.out.println("Number of countries :" + option.size());
		  
		 for(int i=0; i<option.size(); i++)
			{
				System.out.println(option.get(i).getText());
			}
			
	  }
	    
	
		@After
		public void tearDown()
		{
			driver.close();
			driver.quit();
		}
			
		
}	
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


