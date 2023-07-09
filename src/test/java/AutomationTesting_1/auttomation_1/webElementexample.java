package AutomationTesting_1.auttomation_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
@Test
public class webElementexample  extends BaseDriver{
	String Url="https://demoqa.com/automation-practice-form";
	public void webElementsTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(Url);
		
		WebElement e = driver.findElement(By.id("firstName"));
		
		e.sendKeys("Tanvir Hossain");
		Thread.sleep(2000);
	    e.clear();
	    e.sendKeys("ABM aftabuzamman");
		Thread.sleep(5000);
		e.clear();
		e.sendKeys("abc");
		Thread.sleep(2000);
		
	}
	
	
	
	
	
	
	

}
