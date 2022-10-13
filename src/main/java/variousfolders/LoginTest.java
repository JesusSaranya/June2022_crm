package variousfolders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	    static WebDriver driver;
	
		public static void init() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sarne\\Selenium\\crm\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		public static void logintest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		}
		
		public static void tearDown() {
		driver.close();
		driver.quit();
		}
		
		public static void negLoginTest()
		{
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			driver.findElement(By.id("password")).sendKeys("abc123567");
			driver.findElement(By.name("login")).click();
		}			

       public static void main(String [] args) {
	
		 init();
		 logintest();
		 tearDown();
		 
		 init();
		 negLoginTest();
		 tearDown();   
	   
   }

       }



