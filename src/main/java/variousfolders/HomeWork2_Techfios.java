package variousfolders;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWork2_Techfios {

	WebDriver driver;
	
	
	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarne\\Selenium\\crm\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void loginTest() throws InterruptedException {
		// STORE WEBELEMENT
		WebElement USER_NAME_ELEMENT = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement PASSWORD_ELEMENT = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement SIGNIN_BUTTON_ELEMENT = driver.findElement(By.xpath("//button[@name='login']"));

		USER_NAME_ELEMENT.sendKeys("demo@techfios.com");
		PASSWORD_ELEMENT.sendKeys("abc123");
		SIGNIN_BUTTON_ELEMENT.click();

		driver.findElement(By.linkText("Transactions")).click();
		driver.findElement(By.linkText("New Deposit")).click();

		// SELECTOPTION FROM DROPDOWN============
		WebElement accountdropdown = driver.findElement(By.xpath("//select[@id='account']"));
		Select acctdd = new Select(accountdropdown);

		// FINDING NUMBER OF ACCOUNT NAMES IN DROPDOWN============
		List<WebElement> allaccountname = acctdd.getOptions();
		System.out.println("Total number of accountname : " + allaccountname.size());

		// selecting option from dropdown
		for (WebElement acctn : allaccountname) {
			if (acctn.getText().equals("BankingAccount")) {
				acctn.click();
			}
		}

		// WITHOUT USING SELECT OBJECT=========
		/*
		 * List<WebElement> allaccountname =
		 * driver.findElements(By.xpath("//select[@id='account']/option"));
		 * for(WebElement acctp:allaccountname) 
		 * { System.out.println(acctp.getText());
		 *  }
		 */

		Thread.sleep(5000);

		// CLICK ON ANY ACCOUNT NAME=======
		acctdd.selectByVisibleText("Johnny634");

		// CATCH A DATE=========
		driver.findElement(By.id("date"));

		// ATTACH A FILE========
		driver.findElement(By.id("description")).sendKeys("F:\\Desktop - sarne user\\Saranya_QA_Related");

		// TYPE ANY AMOUNT============
		driver.findElement(By.id("amount")).sendKeys("5000000");

		// CLICK ON SUBMIT BUTTON===========
		driver.findElement(By.id("submit")).click();

		// CAPTURE ALL THE ACCOUNT NAME AND PRINT MY CONSOLE WINDOW
		/*
		 * for(int i=0; i<=allaccountname.size(); i++) {
		 * System.out.println(allaccountname.get(i).getText()); }
		 */

		for (WebElement acctn : allaccountname) {
			System.out.println(acctn.getText());
		}

	}

}
