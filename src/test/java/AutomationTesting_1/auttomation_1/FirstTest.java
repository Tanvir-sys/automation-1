package AutomationTesting_1.auttomation_1;

import org.testng.annotations.Test;

public class FirstTest  extends BaseDriver{
	@Test    //annotation for Run
	public void test1() throws InterruptedException {
		driver.get("");   // for execute hit the url
		Thread.sleep(5000);
	}

}
