package testScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest_DriverCommand {

	@Test
	public void AmazonSearchTest() throws Exception {

		System.setProperty("webdriver.chrome.driver", ".\\jar\\chromedriver_90.exe");
		WebDriver driver = new ChromeDriver();

		
		driver.get("http://www.amazon.in/");
		
		System.out.println("Application Source: >>>>>>" + driver.getPageSource());
		System.out.println("Application URL: >>>>>>" + driver.getCurrentUrl());
		System.out.println("Application title: >>>>>>" + driver.getTitle());
		
		//Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More items - Amazon.in");
		//Assert.assertTrue(driver.getTitle().contains("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();

		
	}

}
