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
		System.out.println("Attribute Value :"  +e.getAttribute("pattern"));
		String formValue= e.getText();
		System.out.println(formValue);
		
		e.sendKeys("Tanvir Hossain");
		Thread.sleep(1000);
	    e.clear();
	    e.sendKeys("ABM aftabuzamman");
		Thread.sleep(1000);
		e.clear();
		e.sendKeys("abc");
		Thread.sleep(1000);
		
	
		
	}
	
	
	
	
	
	
	

}
