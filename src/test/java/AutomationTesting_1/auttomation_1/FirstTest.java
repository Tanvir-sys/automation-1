package AutomationTesting_1.auttomation_1;

//import java.util.Scanner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest  extends BaseDriver{
	@Test    //annotation for Run
	@BeforeTest
	public void test1() throws InterruptedException {
		
		
		
		driver.get("https://github.com/Tanvir-sys/automation-1/tree/main");   // for execute hit the url
		Thread.sleep(10000); // for 10 sec hold 
		System.out.println(driver.getTitle());
	}

}
