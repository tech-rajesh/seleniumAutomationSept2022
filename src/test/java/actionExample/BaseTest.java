package actionExample;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import configExample.ReadConfigData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	
	
	WebDriver driver;
	WebElement txtEmail;
	ReadConfigData conf;
	Actions act;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		conf = new ReadConfigData();
		//System.out.println(conf.getApplicationURL_QA());
		
		//driver.get(conf.getDemoApp());
		driver.get(conf.getDemoDragDropApp());
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		act = new Actions(driver);
	}

	
	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(5000);
		driver.close();
	}
	
	
	
	
}
