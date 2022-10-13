package variousfolders;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {

	WebDriver driver;
	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarne\\Selenium\\crm\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=login/after/dashboard");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void loginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Bank & Cash")).click();
		driver.findElement(By.partialLinkText("New Account")).click();
		driver.findElement(By.name("account")).sendKeys("Saran");
		driver.findElement(By.name("description")).sendKeys("Open");
		driver.findElement(By.id("balance")).sendKeys("12345");
		driver.findElement(By.id("account_number")).sendKeys("54678986");
		driver.findElement(By.name("contact_person")).sendKeys("Jesus");
		driver.findElement(By.id("contact_phone")).sendKeys("41276587467");
		driver.findElement(By.id("ib_url")).sendKeys("nothing");
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links :" + links.size());

		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Number of images :" + images.size());

		System.out.println(driver.getTitle());

		for (int i = 0; i <= links.size(); i++) {
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
		}
	    }

		@Test
		public void negloginTest() {
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			driver.findElement(By.id("password")).sendKeys("abc123456");
			driver.findElement(By.name("login")).click();
		}
	
		@After
		public void tearDown() {
			driver.close();
			driver.quit();
		}

}
