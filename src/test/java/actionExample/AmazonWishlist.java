package actionExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonWishlist {
	
	
	@Test
	public void verifyWishList() {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement signIn = driver.findElement(By.xpath("//span[contains(text(),'sign in')]"));
		WebElement wishList = driver.findElement(By.xpath("//span[contains(text(),'Create a Wish')]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(signIn).moveToElement(wishList).click().perform();
		
		//act.moveToElement(signIn).click(wishList).perform();
		
	}

}
