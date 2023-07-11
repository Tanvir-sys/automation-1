package AutomationTesting_1.auttomation_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alert1 extends BaseDriver{
	
	String Url="https://demoqa.com/alerts";
	@Test
	public void AlertTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(Url);
		WebElement w = driver.findElement(By.xpath(" //button[@id='alertButton']"));
		w.click();
		Thread.sleep(3000);
		
			
		
		
			
		
		
	}

}
