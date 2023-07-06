package AutomationTesting_1.auttomation_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorExample extends BaseDriver {
	@Test
	public void testlocators() throws InterruptedException  {
		
		driver.manage().window().maximize();
		driver.get("https://www.shohoz.com/contact-us");
		Thread.sleep(5000);
		
	WebElement e=driver.findElement(By.id("purpose")); // by id
	e.click();
		Thread.sleep(5000);
		
//		WebElement e=driver.findElement(By.name("purpose"));
//		e.click();
//		Thread.sleep(2000);
		
		WebElement s= driver.findElement(By.linkText("Launch"));
		s.click();
		Thread.sleep(2000);
		
		WebElement l=driver.findElement(By.xpath("//*[@id=\"main_wrapper\"]/div/div/header/div[1]/div/div/div/ul/li[1]/a"));
		l.click();
		Thread.sleep(10000);
		WebElement  a=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		a.sendKeys("abs@lito.com");
		a=driver.findElement(By.xpath("//*[@id=\"comment\"]"));
		a.sendKeys("Hey This Is Tanvir from QA Team To check the system");
		Thread.sleep(20000);
		
		
	}

}
