package testNGListnerDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


//@Listeners(testNGDemo.ListnersTest2.class)
public class HRMLoginTest {

	static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	@AfterTest
	public void close() throws Exception {
		Thread.sleep(4000);
		driver.quit();
		
	}
	
	@Test(priority=1)
	public void login() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();

		//add verification - verify DashBoard is present on page 
		WebElement dashboard = driver.findElement(By.tagName("h1"));
		String actual_dashboardText = dashboard.getText();				//Dashboard
		System.out.println("Text: " + actual_dashboardText);
		Assert.assertEquals(actual_dashboardText, "Dashboard", "verification get failed for dashboard");
		
		
	}
	
	@Test(priority=2)
	public void logout() throws Exception {
		
		driver.findElement(By.cssSelector("a#welcome")).click();
		Thread.sleep(4000);
		Assert.assertTrue(false, "verify logout feature");
		//driver.findElement(By.cssSelector("a[href$='auth/logout']")).click();
		
	}
	
}
