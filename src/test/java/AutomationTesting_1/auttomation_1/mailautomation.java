package AutomationTesting_1.auttomation_1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mailautomation extends BaseDriver {
	
	
	
	String url="https://mail.mafshoes.com/?loginOp=logout";
	@Test
	public void automail() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(1000);
		
		
		
		//---implementation for multiple user mail---//
		
			
	       WebElement email =driver.findElement(By.xpath("//*[@id=\"details-button\"]"));
	       email.click();
	       WebElement x =driver.findElement(By.xpath("//*[@id=\"proceed-link\"]"));
	       x.click();
       
		WebElement x1=driver.findElement(By.id("username"));
		
		x1.sendKeys("josat.abedin@mafshoes.com");
	
		WebElement x2=driver.findElement(By.id("password"));
		
		
		x2.sendKeys("Jos@t22");
		
		WebElement x3=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input[2]"));
		x3.click();
		
		WebElement c =driver.findElement(By.id("zti__main_Mail__4_textCell"));
		c.click();
		System.out.println("There  is  mail in junk");
		
		 WebElement s =driver.findElement(By.xpath("//*[@id=\"zl__CLV-main__rows\"]"));
		 Actions act=new Actions(driver);
		  act.keyDown(Keys.CONTROL);
		  act.sendKeys("a");
	      act .keyUp(Keys.CONTROL);
	      act.perform();
	     WebElement we =driver.findElement(By.xpath("//*[@id=\"zb__CLV-main__SPAM_title\"]"));
	     we.click();
	      Thread.sleep(2000);
	 
		 
//		if(c.getText().length()<=4) {
//			System.out.println("there is no mail in junk");
	      
	      
//			
//			Thread.sleep(2000);
//		}else {
//			
//		}
//		
//	   
//  
	   

   
//       
   
       
       

		
	
	

     
		
	
}
	
	

}
