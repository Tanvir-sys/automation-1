package AutomationTesting_1.auttomation_1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hover extends BaseDriver {
	@Test
	public void MouseHover() 
	{ 
		driver.manage().window().maximize();
		String url = "www.daraz.com.bd";
		driver.get(url);
		
		Actions Ac=new Actions (driver);
		
		WebElement home = driver.findElement(By.xpath("/span[contains(text(),'Home & Lifestyle')]"));
		Ac.moveToElement(home).perform();
		
	//Thread.sleep(30000);
		
		
		
		
		
	}

}
