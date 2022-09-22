package locatorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NOPCommTest {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void launchApp() {
		
		driver = WebDriverManager.chromedriver().create();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(5000);
		//driver.close();
	}
	
	@Test(priority = 1)
	public void login() throws Exception {
		
		//enter userName
		//Name
		driver.findElement(By.name("Email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		String className  = driver.findElement(By.name("Email")).getAttribute("class");
		System.out.println(className);
		Thread.sleep(2000);
		//driver.findElement(By.className("email")).clear();
		
		
		
		//ID
		//passowrd field
		WebElement txtPass = driver.findElement(By.id("Password"));
		
		txtPass.clear();
		txtPass.sendKeys("admin");
		
		
		//tagname
		//findElements
		
		driver.findElements(By.tagName("input")).get(2).click();		//click operation on checkbox
		
		Thread.sleep(3000);
		driver.findElement(By.tagName("button")).click();
		
		
		//LinkText
		//click on Logout
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Logout")).click();
		
		
		//PartialLinkText
		//click on Logout
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("ogo")).click();
		
		
		Thread.sleep(3000);
		
		//XPATH
		//Login Button
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		Thread.sleep(3000);
		//Css Selector
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
	}
	
	
}
