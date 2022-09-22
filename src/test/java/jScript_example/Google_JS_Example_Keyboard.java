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

public class Google_JS_Example_Keyboard {
	WebDriver driver;

	@BeforeTest
	public void openApp() {

		System.setProperty("webdriver.chrome.driver", ".\\jar\\chromedriver_92.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

	}

	@Test
	public void GooglePage() throws Exception {

		//Using WebElement
		WebElement Btn_Google = driver.findElement(By.xpath("(//input[@name=\"btnK\"])[2]"));
		//KeyBoard operation
		driver.findElement(By.cssSelector("[name='q']")).sendKeys("iphone" + Keys.ENTER);
		
		
		//JAVAScript
		
		  JavascriptExecutor JS = (JavascriptExecutor) driver;
		  JS.executeScript("arguments[0].click();", Btn_Google);
		 
		
		
		  WebElement ele_view =driver.findElement(By.xpath("//span[text()='Related searches']"));
		  //span[text()='Related searches']
		  
		  JS.executeScript("arguments[0].scrollIntoView();", ele_view);
		 
		
		
	}

}
