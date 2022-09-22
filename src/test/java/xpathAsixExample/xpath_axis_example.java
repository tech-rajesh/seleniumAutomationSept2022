package xpathAsixExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_axis_example {

	@Test
	public void XPATHAsix() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();

		Thread.sleep(5000);

		
		
		
		//driver.findElement(By.xpath("//td[text()='Helen Bennett']//preceding-sibling::td/input[@type=\"checkbox\"]")).click();
		WebElement checkbox = driver.findElement(By.xpath("//td[text()='Helen Bennett']//preceding-sibling::td/input[@type=\"checkbox\"]"));
		
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		JS.executeScript("arguments[0].click()", checkbox);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.xpath("//td[contains(text(),'Maria')]/preceding-sibling::td/child::input")).click();
//		
//		//driver.findElement(By.xpath("//td[contains(text(),'Maria')]//preceding-sibling::td//child::input")).click();
//		//driver.findElement(By.xpath("")).click();)

	}

}
