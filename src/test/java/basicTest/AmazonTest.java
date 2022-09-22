package basicTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {
	
	
	
	@Test
	public void verifySearchTest() throws Exception {
		
		
		//Selenium
		//driverpath
		//edge - browser
		//launching app - Amazon Page
		
		//ChromeDriver anyName = new ChromeDriver();
		
		//System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
				
		
		
		
		
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		//identification
		WebElement txt_Email =  driver.findElement(By.name("Email"));
		
		Thread.sleep(2000);
		txt_Email.clear();				//clear the result 
		Thread.sleep(2000);
		txt_Email.sendKeys("admin@admin.com");
		//variable in java
		//int name = 1000;
		
		
		//close application
		driver.close();
		//driver.quit();
		
		
		
	}
	

}
