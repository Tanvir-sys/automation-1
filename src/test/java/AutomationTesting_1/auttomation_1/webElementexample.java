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
		
		WebElement q= driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]"));
		System.out.println("Attribute Value :"  +q.getAttribute("pattern"));
		String formValue= q.getText();
		
			System.out.println(formValue);
				
				    e.sendKeys("Tanvir Hossain");
				Thread.sleep(1000);
			        e.clear();
				    e.sendKeys("ABM aftabuzamman");
				Thread.sleep(1000);
					e.clear();
					e.sendKeys("Monjurul Hoq");
				Thread.sleep(1000);
			if(e.isDisplayed()) {         //  for positive case 
					e.clear();
					e.sendKeys("Hello ");
				Thread.sleep(2000);
			}else {
				
				System.out.println("Email Id Not Locateable .");
			}
	
	}
	
	
	
	
	
	
	

}
