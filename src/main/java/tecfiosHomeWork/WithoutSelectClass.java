package tecfiosHomeWork;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSelectClass {

	
	WebDriver driver;
	
	@Before
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarne\\Selenium\\crm\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void LoginTest()
	{
		
		By USERNAME_FIELD = By.xpath("//input[@id='username']");
		By PASSWORD_FIELD = By.xpath("//input[@id='password']");
		By SIGNIN_BUTTON_FIELD = By.xpath("//button[@name='login']");
		By TRANSACTION_FIELD = By.linkText("Transactions");
		By NEWDEPOSITE_FIELD = By.linkText("New Deposit");
		
		driver.findElement(USERNAME_FIELD).sendKeys("demo@techfios.com");
		driver.findElement(PASSWORD_FIELD).sendKeys("abc123");
		driver.findElement(SIGNIN_BUTTON_FIELD).click();
		driver.findElement(TRANSACTION_FIELD).click();
		driver.findElement(NEWDEPOSITE_FIELD).click();
		
		//CAPTURE ALL THE NAMES IN DROP DOWN AND PRINT===========
		List<WebElement> allnames = driver.findElements(By.xpath("//select[@id='account']/option"));
		
		/*for(WebElement names : allnames)
		{
			System.out.println(names.getText());
		}*/
		
		//TOTAL NUMBER OF NAMES==============
		System.out.println("ToTal number of names :" + allnames.size());
		
		// SELECTING OPTION FROM DROPDOWN=================
		for(WebElement names :allnames)
		{
			if(names.getText().equals("James"))
			{
				names.click();
				break;
			}
		}
		
		
		
		
		
		
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
