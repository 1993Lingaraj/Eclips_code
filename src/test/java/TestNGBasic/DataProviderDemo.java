package TestNGBasic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	/*
	 * DataProvider:
	 * 
	 * to execute the same TC with different set of data
	 * 2D object array is created 
	 * 
	 * Steps:
	 * ------
	 * 1. create any method with any name 
	 * 2. create a 2D array Object
	 * 3. Assign some values 
	 * 4. Return the 2D Object
	 * 5. Mark the method with annotation @DataProvider
	 * 
	 * 
	 * 
	 */
	
	
	@Test(dataProvider = "getLogginData")
	public void validatingLoginTest(String uname, String pwd) {
		System.out.println("username is" + uname + "password is " + pwd);
		
	}
	
	@DataProvider
	
	public Object[][]  getLoginData() {
		
		
		//There are 2 types of parameter
		// * 1. First parameter defines the no of rows, How many times to execute
		 //* 2. Second parameter defines How many values we use per execution
		
		Object[][]data = new Object[3][2];
		data[0][0] =  "admin"; 
		data[0][1] = "admin123";
		
		data[1][0] =  "hr"; 
		data[1][1] = "hr123";
		
		data[2][0] =  "finance"; 
		data[2][1] = "finance123";
			
		return data;
		
	}

}
