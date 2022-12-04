package TestNGBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {
	
    @Test
	public void validateTitleTC() {
		
		String expTitle = "Facebook – log in or sign up";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actTitle = driver.getTitle();
		driver.quit();
		Assert.assertEquals(expTitle, actTitle);
    }
			@Test
		public void ValidateLogoisDisplayed()
		{
			//*[@id="content"]/div/div/div/div[1]/div/img
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement LogoDispalyed = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));
			boolean LogoDisplayed = false;
			Assert.assertTrue(LogoDisplayed);
			driver.quit();
		}
			}
		
		
		
		
		
	

	

