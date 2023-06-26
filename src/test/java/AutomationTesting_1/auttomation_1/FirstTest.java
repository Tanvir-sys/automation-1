package AutomationTesting_1.auttomation_1;

import java.util.Scanner;

import org.testng.annotations.Test;

public class FirstTest  extends BaseDriver{
	@Test    //annotation for Run
	public void test1() throws InterruptedException {
		
		
		
		driver.get("http://192.168.5.26:8080/ords/f?p=104:2183::::::");   // for execute hit the url
		Thread.sleep(5000);
	}

}
