package locatorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NOPCommTest2 {
	
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
		
		//get application title
		
		String actualTitle = driver.getTitle();
		System.out.println("Application Title before Login: " + actualTitle);
		
		
		String appURL = driver.getCurrentUrl();
		String appPageSource = driver.getPageSource();
		
		String window = driver.getWindowHandle();
		
		
		
		driver.findElement(By.name("Email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		
		
		WebElement txtPass = driver.findElement(By.id("Password"));
		txtPass.clear();
		txtPass.sendKeys("admin");
		
		
		//Button present on page
		Boolean isLoginButtonPresent = driver.findElement(By.tagName("button")).isDisplayed();
		System.out.println(isLoginButtonPresent);
		
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(5000);
		String actualTitleAfterLogin = driver.getTitle();
		System.out.println("Application Title after Login: " + actualTitleAfterLogin);
		
		
		
		//Button present on page
		Boolean isDashboardPresent = driver.findElement(By.xpath("//h1[contains(text(),'Dash')]")).isDisplayed();
		System.out.println(isLoginButtonPresent);
		
	}
	
	
}
