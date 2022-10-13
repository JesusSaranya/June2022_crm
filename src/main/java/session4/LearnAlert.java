package session4;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	WebDriver driver;

	@Before
	public void initDriver() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void handlingAlart() throws InterruptedException {

		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		/*String alartText = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println("popup message :" + alartText);*/
		
		String message =driver.switchTo().alert().getText();
		System.out.println(message);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		

	}

}
