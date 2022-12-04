package TestNGBasic;

import org.testng.annotations.Test;

public class priorityDemoTestNg {
	
	/*
	 * by default
	 * the TC's are executed alphabetical Order
	 * 
	 * 
	 * priority
	 * we can control execution order
	 * *when we are not assign any priority than : The scheduling priority. Lower priorities will be scheduled first.
	 * return: the value (default 0)
	 * 
	 * *if 2 Tc's are writen with out any priority than it will run as alphabetical order 
	 */
	
	
	@Test(priority = 1)
	public void lion() {
		System.out.println("TC3");
}

	@Test
	public void xerox() {
		System.out.println("TC4");
}
	
	@Test
	public void beta() {
		System.out.println("TC5");
}
	
	@Test(priority = 3)
	public void delpha() {
		System.out.println("TC2");
}
	
	
	@Test(priority = 2)
	public void apple() {
		System.out.println("TC1");
	}
	
}

