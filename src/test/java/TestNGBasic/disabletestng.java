package TestNGBasic;

import org.testng.annotations.Test;

public class disabletestng {
	
	@Test(priority =2)
	void Testone() {
		System.out.println("This is test1");
	}
	@Test(priority =1)
	void TestTwo() {
		System.out.println("This is test2");
	}
	@Test(priority = 4)
	void TestThree() {
		System.out.println("This is Test3");
	}
	@Test (priority =3,enabled=false)
	void TestFour() {
		System.out.println("This is Test4");
	}
}
