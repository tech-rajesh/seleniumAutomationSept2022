package testScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;




public class OrangeHRM_LocatorTest {
	
	
	
	@Test
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", ".\\jar\\chromedriver_90.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		//Identification - unique identification 
		//Locator - id/name/class/tagname/link-text/partial-linktext/XPATH/CSSSelector
		
		//ID
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		/*
		 * driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 * driver.findElement(By.id("btnLogin")).click();
		 */
		
		//Name
		//driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		//class
		//driver.findElement(By.className("button")).click();
		
		//Link-Text
		//driver.findElement(By.linkText("Forgot your password?")).click();
		
		//Partial Link-Text
		//driver.findElement(By.partialLinkText("Forgot your ")).click();
		
		//XPATH
		//input[@name='txtUsername']
		//input[@id='txtUsername']
		//*[@name='txtUsername']
		//*[@id='txtUsername']
		/*
		 * driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		 * driver.findElement(By.xpath("//INPUT[@id='btnLogin']")).click();
		 */
		
		//CSSSelector
		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("INPUT[id='btnLogin']")).click();
		
	}

}
