package AutomationTesting_1.auttomation_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NavigateExample extends BaseDriver{
	String Url= "https://www.daraz.com.bd/";
	@Test
	public void navigate() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(Url);
		WebElement signup=driver.findElement(By.xpath("//*[@id=\"anonLogin\"]/a"));
		signup.click();	
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		
	}
	
	
	
	

}
