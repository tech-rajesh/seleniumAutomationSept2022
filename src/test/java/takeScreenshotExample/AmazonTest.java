package takeScreenshotExample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import configExample.ReadConfigData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {

	WebDriver driver;
	ReadConfigData conf;

	@BeforeTest
	public void launchApp() throws Exception {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);

		conf = new ReadConfigData();
		System.out.println(ReadConfigData.getDropDownApp());

		// driver.get("http://www.uitestpractice.com/Students/Switchto");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void closeApp() throws Exception {

		Thread.sleep(5000);
		driver.close();
	}

	@Test
	public void searchTest() throws Exception {
		
		getScreenshot("beforeLogin");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");

		driver.findElement(By.cssSelector("[value=\"Go\"]")).click();

		Thread.sleep(5000);

		Assert.assertTrue(driver.getTitle().contains("iphone 14"));

		// takescreenshot
		getScreenshot("afterSearch");

	}

	public void getScreenshot(String methodName) throws Exception {

		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		//random char
		//name+randomchar
		
		File targetLocation = new File("./screenshot/"+methodName+".png");

		FileUtils.copyFile(screenshotFile, targetLocation);

	}

}
