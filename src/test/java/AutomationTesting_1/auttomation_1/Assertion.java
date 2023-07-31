package AutomationTesting_1.auttomation_1;
import org.testng.Assert;

import org.testng.annotations.Test;




public class Assertion extends BaseDriver {
	String url="https://www.selenium.dev/";
	
	
	@Test
	public void Assertion() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		String expectedTitle="Selenium";
		String actualTitle=driver.getTitle();
		
		//hard Assertion 

		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("pass");
		Thread.sleep(1000);
		
	}

}
