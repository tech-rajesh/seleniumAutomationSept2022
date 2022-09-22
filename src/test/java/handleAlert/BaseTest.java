package handleAlert;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import configExample.ReadConfigData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	
	
	WebDriver driver;
	WebElement txtEmail;
	ReadConfigData conf;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		
		
//		ChromeOptions opt = new ChromeOptions();
//		opt.
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", "--window-size=1920,1200");
		//WebDriver driver = new ChromeDriver(options);
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		
		
		conf = new ReadConfigData();
		System.out.println(ReadConfigData.getDropDownApp());
		
		driver.get("http://www.uitestpractice.com/Students/Switchto");
		//driver.get(conf.getDropDownApp());
		driver.manage().window().maximize();
		
		
		
		
		
		
		
	}

	
	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(5000);
		driver.close();
	}
	
	
	
	
}
