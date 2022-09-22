package basicTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NOPComm_Edge_ChromeTest {
	
	WebDriver driver;
	
	@Test
	public void verifySearchTest() throws Exception {
		
		
		//Selenium
		//driverpath
		//edge - browser
		//launching app - Amazon Page
		
		//ChromeDriver anyName = new ChromeDriver();
		
//		System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
//		//EdgeDriver driver = new EdgeDriver();
//		//ChromeDriver driver = new ChromeDriver();
//		WebDriver driver = new EdgeDriver();	
		
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
			//advanced - webdrivermanager 
			
		}
		
		else if (browser.equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			
		}
		
		else {
			
			
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		
		
		
			
		
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	    driver.findElement(By.id("Email")).sendKeys("test");
	    
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".buttons")).click();
				
		
//		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
//		
//		//identification
//		WebElement txt_Email =  driver.findElement(By.name("Email"));
//		
//		Thread.sleep(2000);
//		txt_Email.clear();				//clear the result 
//		Thread.sleep(2000);
//		txt_Email.sendKeys("admin@admin.com");
//		//variable in java
//		//int name = 1000;
//		
//		
//		//unique - edge
//		
//		
//		//close application
//		driver.close();
//		//driver.quit();
		
		
		
	}
	

}
