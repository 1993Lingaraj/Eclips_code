package ParallelTestNGTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RunTestParallel {
	
	WebDriver driver;
	@Test
	void logotest() {
		System.setProperty("webdriver.chrome.driver" ,"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]"));
		Assert.assertTrue(logo.isDisplayed());
		
	}
	
	

}
