package TestNGBasic;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class alwaysRun {
	
	@Test
	void startcar() {
		System.out.println("car started");
		Assert.fail();
	}
	@Test(dependsOnMethods = {"startcar"})
	void drivecar() {
		System.out.println("car driving");
	}
	@Test(dependsOnMethods = {"drivecar"})
	void stopcar() {
		System.out.println("car stoped");
	}
	@Test(dependsOnMethods = {"drivecar", "stopcar"},alwaysRun=true)
	void parkcar() {
		System.out.println("car parked");
	}

}
