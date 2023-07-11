package AutomationTesting_1.auttomation_1;

import org.openqa.selenium.Alert;
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
		Alert alert= driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		System.out.println("..........Print For 1st alert notification...............");
		
		WebElement s = driver.findElement(By.id("confirmButton"));
		s.click();
		
		alert.dismiss();
		Thread.sleep(3000);
		
		WebElement e =driver.findElement(By.id("confirmResult"));
		
		String f=e.getText();
			
		System.out.println(f);
		
		
		
		
		
		
		
	}

}
