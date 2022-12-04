package TestNGBasic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider1 {
	@Test(dataProvider="LoginDataprovider",dataProviderClass=CustomDataProvider.class)
	public void LoginTest(String email, String pwd) {
		System.out.println(email +"  "+ pwd);
		
	}
	
	

}




/* it is a custom DataProvider example
    Here the Data provider method is present with different class
    so we use this annotation (dataProvider="LoginDataprovider",dataProviderClass=CustomDataProvider.class)
*/ 