package tecfiosHomeWork;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.By;

public class TestRunner {

	public static void main(String[] args) {
	
		
		Result result =JUnitCore.runClasses(HomeWork3.class);
		
		for(Failure failure : result.getFailures())
		{
			System.out.println(failure.toString());
		}
		
		System.out.println("Result========" + result.wasSuccessful());
		
		

	}

}

		/*driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jesus26@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("342567454367");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("2536,thurnembgjuch,NorthCarolina"); 
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("cumberland");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("New York");
		driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("34526");*/
