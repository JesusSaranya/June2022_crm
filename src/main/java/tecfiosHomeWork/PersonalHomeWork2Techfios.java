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

public class PersonalHomeWork2Techfios {

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
		By TRANSACTION_FIELD      = By.linkText("Transactions");
		By NEWDEPOSITE_FIELD      = By.linkText("New Deposit");
		
		driver.findElement(USERNAME_FIELD).sendKeys("demo@techfios.com");
		driver.findElement(PASSWORD_FIELD).sendKeys("abc123");
		driver.findElement(SIGNIN_BUTTON_FIELD).click();
	    driver.findElement(TRANSACTION_FIELD).click();
	    driver.findElement(NEWDEPOSITE_FIELD).click();
	   
	    //SELECT OPTION FROM DROPDOWN===========
	    WebElement dropdown = driver.findElement(By.xpath("//select[@id='account']"));
	    Select sel =new Select(dropdown);
	     
	    // CLICK ON ANY ACCOUNT=======
	    sel.selectByVisibleText("Business");
	    
	    //CATCH A DATE=========
	    driver.findElement(By.id("date"));
	    
	    //TYPE ANY DESCRION==========
	    driver.findElement(By.id("description")).sendKeys("F:\\Desktop - sarne user\\Saranya_QA_Related");
	    
	    //TYPE ANY AMOUNT=========
	    driver.findElement(By.id("amount")).sendKeys("2000000");
	    
	    //CLICK ON SUBMIT BUTTON========
	    driver.findElement(By.xpath("//button[@id='submit']")).click();
	    
	   
	   }
	
	
	   @After
	   public void tearDown()
	   {
		   driver.close();
	   }
	
	
	  
	
	
	
	
	
	

	}	
	

