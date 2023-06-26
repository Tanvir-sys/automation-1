package AutomationTesting_1.auttomation_1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TesNgExample {
	
	
	@Test
	public void test2() {
		System.out.println("Annotation Practice");
		
	}
	
	@AfterSuite
	public void aftersuittest() {
		System.out.println("After suite");
		
	}
	
	@BeforeSuite
	public void beforesuittest() {
		System.out.println("Before Suite");
		
	}
	
	

}
