package jScript_example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Myntra_JS_Example {
	WebDriver driver;

	@BeforeTest
	public void openApp() {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");

	}

	@Test
	public void GooglePage() throws Exception {

		
		//WebElement return_policy =driver.findElement(By.xpath("//strong[contains(.,'Return within 30days')]"));
		WebElement return_policy =driver.findElement(By.xpath("//strong[text()='Return within 30days ']"));
		
		  JavascriptExecutor JS = (JavascriptExecutor) driver;
		  
		  JS.executeScript("arguments[0].scrollIntoView();", return_policy);
		 
		
		
	}

}
