package TestNGBasic;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class Testgroup1 {

	@Ignore
	@Test(groups = "regresion")
	public void TC1() {
		System.out.println("TC1");
		
	}
	@Test(groups = "smoke", invocationCount = 3 ) 
	public void TC2() {
		System.out.println("TC2");
		
	}
	
	@Test (enabled = false)	
	public void deprecateFeature() {
		System.out.println("deprecateFeature");
		
	}
}
