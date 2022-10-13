package tecfiosHomeWork;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Personal_HomeWork1TechFios {

	WebDriver driver;
	
	@BeforeClass
	public static void beforeclass()
	{
		System.out.println("Before class...");
	}
	
	@AfterClass
	public static void afterclass()
	{
		System.out.println("after class...");
	}
	@Before
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarne\\Selenium\\crm\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin");
		driver.manage().window().maximize();
	}
	
	@Test
	public void LoginTest()
	{
		By USERNAME_FIELD         = By.xpath("//input[@id='username']");
		By PASSWORD_FIELD         = By.xpath("//input[@id='password']");
		By SIGNIN_BUTTON_FIELD    = By.xpath("//button[@name='login']");
		By BANKCASH_FIELD         = By.linkText("Bank & Cash");
		By NEWACCOUNT_FIELD       = By.partialLinkText("New Account");
		By ACCOUNT_TITLE_FIELD    = By.id("account");
		By DESCRIPTION_FIELD      = By.id("description");
		By INITIAL_BALANCE        = By.name("balance");
		By ACCOUNT_NUMBER_FIELD   =By.id("account_number");
		By CONTACTPERSON_FIELD    = By.name("contact_person");
		By PHONENUMBER_FIELD      = By.id("contact_phone");
		By INTERNETBANKING_URL_FIELD = By.id("ib_url");
		By SUBMIT_BUTTON_FIELD       = By.xpath("//button[normalize-space()='Submit']");
		
		
		driver.findElement(USERNAME_FIELD).sendKeys("demo@techfios.com");
		driver.findElement(PASSWORD_FIELD).sendKeys("abc123");
		driver.findElement(SIGNIN_BUTTON_FIELD).click();
		driver.findElement(BANKCASH_FIELD).click();
		driver.findElement(NEWACCOUNT_FIELD).click();
		driver.findElement(ACCOUNT_TITLE_FIELD).sendKeys("Mary");
		driver.findElement(DESCRIPTION_FIELD).sendKeys("Akshaya");
		driver.findElement(INITIAL_BALANCE).sendKeys("700000");
		driver.findElement(ACCOUNT_NUMBER_FIELD).sendKeys("12345324");
		driver.findElement(CONTACTPERSON_FIELD).sendKeys("sara");
		driver.findElement(PHONENUMBER_FIELD).sendKeys("3546421907");
		driver.findElement(INTERNETBANKING_URL_FIELD).sendKeys("nothing");
		driver.findElement(SUBMIT_BUTTON_FIELD).click();	
	}
	
	@After
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
