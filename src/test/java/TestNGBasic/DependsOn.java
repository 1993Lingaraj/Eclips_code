package TestNGBasic;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * Here "post message" test case also executed first because our all TC's are independent
 * 
 * DependsOn 
 *  The list of methods this method depends on. There is no guarantee on the order on which themethods depended upon will be run, but you are guaranteed that all these methods will be runbefore the test method that contains this annotation is run. Furthermore, if any of thesemethods was not a SUCCESS, this test method will not be run and will be flagged as a SKIP. 

If some of these methods have been overloaded, all the overloaded versions will be run.
Returns:the value
 */

public class DependsOn {
    @Test
	public void validateloginTC() {
		System.out.println("Validate login TC");
		Assert.assertTrue(false);
		
	}
	@Test(dependsOnMethods = "validateloginTC")
	public void validatesendfriendrequestTC() {
		System.out.println("Validate Send Friendrequest TC");
	}
	@Test(dependsOnMethods = "validateloginTC")
	public void validateacceptfriendrequestTC() {
		System.out.println("Validate Accept Friendrequest TC");
	}
	
	@Test(dependsOnMethods = "validateloginTC") 
	public void postmessage() {
		System.out.println("post message");
	}
	@Test
	public void validatelogo() {
		System.out.println("Validating Logo");
	}
	
}
