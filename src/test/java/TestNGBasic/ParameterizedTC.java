package TestNGBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ParameterizedTC {

	@Parameters({"username","password"})
	@Test
	public void ValidateLogin(){
		
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("lingarajmishra26@gmail.com");
driver.findElement(By.id("pass")).sendKeys("Chinu@12345");

	}
	
	@Parameters({"username","password"})
	@Test
	public void ValidateLogin2(){
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("lingarajmishra26@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Chinu@12345");
}
}
