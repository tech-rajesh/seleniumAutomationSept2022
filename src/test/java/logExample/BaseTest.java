package logExample;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import configExample.ReadConfigData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
	ReadConfigData conf;
	Logger log ;

	@BeforeTest
	public void launchApp() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		
		//Config File
		log = Logger.getLogger("NOPComm Application- module1");
		PropertyConfigurator.configure(".\\testData\\log4j.properties");
		
		log.info("Chrome browser launched.");
		
		conf = new ReadConfigData();
		System.out.println(conf.getApplicationURL_QA());

		driver.get(conf.getApplicationURL_QA());
		log.info("Application launched : " + conf.getApplicationURL_QA());
		driver.manage().window().maximize();
	}

	@AfterTest
	public void closeApp() throws Exception {

		Thread.sleep(5000);
		driver.close();
		log.info("Chrome browser closed.");
	}

	@BeforeMethod
	public void delay() throws Exception {

		Thread.sleep(2000);
	}

}
