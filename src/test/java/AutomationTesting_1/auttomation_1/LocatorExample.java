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
		
		WebElement e=driver.findElement(By.id("purpose"));
		e.click();
		Thread.sleep(5000);
	}

}
