package tecfiosHomeWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class HomeWork3 {

WebDriver driver;
	
	@Before
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarne\\Selenium\\crm\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void LoginTest() throws InterruptedException
	{
		
		By USERNAME_FIELD         = By.xpath("//input[@id='username']");
		By PASSWORD_FIELD         = By.xpath("//input[@id='password']");
		By SIGNIN_BUTTON_FIELD    = By.xpath("//button[@name='login']");
		By CUSTOMERS_FIELD        = By.linkText("Customers");
		By ADDCUSTOMER_FIELD      = By.linkText("Add Customer");
		By FULLNAME_FIELD         = By.xpath("//input[@id='account']");
		
		driver.findElement(USERNAME_FIELD).sendKeys("demo@techfios.com");
		driver.findElement(PASSWORD_FIELD).sendKeys("abc123");
		driver.findElement(SIGNIN_BUTTON_FIELD).click();
		
		Assert.assertEquals("Page not found", "Dashboard- iBilling", driver.getTitle());
		
		driver.findElement(CUSTOMERS_FIELD).click();
		driver.findElement(ADDCUSTOMER_FIELD).click();
		
		Assert.assertEquals("page not found", "Contacts - iBilling", driver.getTitle());
		
		driver.findElement(FULLNAME_FIELD).sendKeys("SaranyaThiagarajan");
		
		WebElement company = driver.findElement(By.xpath("//select[@id='cid']"));
		Select sel = new Select(company);
		sel.selectByVisibleText("Amazon");
		//sel.getOptions();
		
		
		By EMAIL_FIELD = By.xpath("//input[@id='email']");
		By PHONE_FIELD = By.xpath("//input[@id='phone']");
		By ADDRESS_FIELD = By.xpath("//input[@id='address']");
		By CITY_FIELD = By.xpath("//input[@id='city']");
		By STATE_FIELD = By.xpath("//input[@id='state']");
		By ZIP_FIELD = By.xpath("//input[@id='zip']");
		
		
		driver.findElement(EMAIL_FIELD).sendKeys("jesus26@gmail.com");
		driver.findElement(PHONE_FIELD).sendKeys("342567454367");
		driver.findElement(ADDRESS_FIELD).sendKeys("2536,thurnembgjuch,NorthCarolina");
		driver.findElement(CITY_FIELD).sendKeys("cumberland");
		driver.findElement(STATE_FIELD).sendKeys("New York");
		driver.findElement(ZIP_FIELD).sendKeys("34526");
		
		
		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		Select ccc = new Select(country);
		ccc.selectByVisibleText("Australia");
		
		WebElement currency = driver.findElement(By.xpath("//select[@id='currency']"));
		Select curr = new Select(currency);
		curr.selectByVisibleText("USD");
		
		WebElement group = driver.findElement(By.xpath("//select[@id='group']"));
		Select gro = new Select(group);
		gro.selectByValue("6");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Heera26$");
		driver.findElement(By.xpath("//input[@id='cpassword']")).sendKeys("Heera26$");
		driver.findElement(By.xpath("//label[@class='btn btn-primary btn-sm toggle-on']")).click();
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		// BACT TO PAGE
		driver.switchTo().defaultContent();
		
		//CLICK LIST CUSTOMER
		driver.findElement(By.linkText("List Customers")).click();
		
		//SEARCH BUTTON PASS My NAME
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search by Name...']")).sendKeys("SaranyaThiagarajan");
		
		// SEARCH BUTTON
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		//CLICK SEARCH BUTTON
		Thread.sleep(3000);
		driver.findElement(By.linkText("SaranyaThiagarajan")).click();
		
		//GET NAME AND VERIFY NAME
		Thread.sleep(3000);
		String Verifyaccount = driver.findElement(By.xpath("//span[@class='thumb-info-inner']")).getText();
		System.out.println("VerifyAccount :"  + Verifyaccount); 
		 
		Assert.assertEquals(Verifyaccount, false, false);
	 }
	
	 @After
	 public void tearDown() throws InterruptedException
	 {
		 Thread.sleep(3000);
		 driver.close();
	 }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   
	   
	   
	   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

