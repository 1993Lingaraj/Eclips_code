package TestNGBasic;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {

@DataProvider(name="LoginDataprovider")
	
	public Object[][]getData()
	{
		Object[][] data= {{"abc@gmail.com","abc"},{"xyz@gmail.com","xyz"},{"123@gmail.com","123"}};
		return data;
	}
}
