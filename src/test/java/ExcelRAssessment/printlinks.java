package ExcelRAssessment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class printlinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		List<WebElement> alltags = driver.findElements(ByTaganme("a"));
		System.out.println("Total Tags are:" +alltags.size());
		

	}

	private static By ByTaganme(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
