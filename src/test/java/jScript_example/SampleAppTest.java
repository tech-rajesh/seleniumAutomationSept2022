package jScript_example;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleAppTest {

	@Test
	public void ListBox_Handling() throws Exception {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://www.google.com");
		 * 
		 * driver.findElement(By.name("q")).sendKeys("iphone");
		 * 
		 * WebElement button =
		 * driver.findElement(By.xpath("(//input[@value=\"Google Search\"])[1]"));
		 * //button.click();
		 * 
		 * 
		 * JavascriptExecutor javascript = (JavascriptExecutor) driver;
		 * javascript.executeScript("arguments[0].click();", button);
		 */
		 
		
		driver.get("https://www.amazon.in/");

		WebElement newtest = driver.findElement(By.xpath("//div[contains(text(),'customer?')]"));
		// Scroll down the webpage by 4500 pixels
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		//js.executeScript("scrollBy(0, 2500)");
		
		js.executeScript("arguments[0].scrollIntoView();", newtest);
		

	}

}
