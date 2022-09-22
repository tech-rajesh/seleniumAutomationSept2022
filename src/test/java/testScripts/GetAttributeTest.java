package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetAttributeTest {

	@Test
	public void GoogleTest() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement button = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
		String actual_button_text = button.getAttribute("value");
		System.out.println("Google button attribute value are: " + button.getAttribute("value"));
		String expected_text = "Google Search";

		Assert.assertEquals(actual_button_text, expected_text, "verify Google Search button attribute property.");
		Assert.assertTrue(driver.getTitle().contains("Google"), "verify Application Title.");

	}

}
