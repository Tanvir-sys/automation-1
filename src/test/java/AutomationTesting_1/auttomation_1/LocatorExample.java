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
		
//		WebElement e=driver.findElement(By.id("purpose")); // by id
//		e.click();
//		Thread.sleep(5000);
		
		WebElement e=driver.findElement(By.name("purpose"));
		e.click();
		Thread.sleep(3000);
		WebElement s= driver.findElement(By.linkText("Launch"));
		s.click();
		Thread.sleep(10000);
		
	}

}
