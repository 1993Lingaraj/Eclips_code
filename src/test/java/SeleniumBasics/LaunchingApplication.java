package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingApplication {
	
	/*
	 * FB Application
	 * Steps
	 * 1. Open the browser
	 * 2. Enter the URL
	 * 3. Enter Username
	 * 4. Enter Password
	 * 5. Click on login button
	 * 6. Close the browser
	 *
	 */
	public static void main (String[]args) {
		WebDriverManager.chromedriver().setup();
		// below line is responsible to open the browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("lingarajmishra26@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Chinu@12345");
		driver.findElement(By.name("login")).click();
		driver.close();	
		
		
		
	}

}
