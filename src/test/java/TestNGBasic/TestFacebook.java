package TestNGBasic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFacebook {
	
	@AfterSuite
	public void sendoverallreports() {
		System.out.println("Sending Overall Execution Report");
	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void Beforetest() {
		System.out.println("Before test");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}
	
	@BeforeClass
	public void Beforeclass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void Afterclass() {
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("launching browser & application");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("closing browser & application");
	}

	@Test(groups = "smoke")
	public void validateTitleTC(){
		//launching browser
	   // launching application
		System.out.println("TC1: Validating Title TC");
	}
@Test(groups = "smoke")
	public void validateLogo(){
		//launching browser
		// launching application
		System.out.println("TC2: Validating Logo TC");
}

}
