package actionExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RightClickDoubleClickTest extends BaseTest{
	
//	WebDriver driver;
//	
//	RightClickDoubleClickTest(WebDriver driver){
//		
//		this.driver = driver;
//		
//	}
//	
//		
	
	//@Test
	public void RightClickTest() throws Exception {
		
		
		
		WebElement rightButton = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		
		act.contextClick(rightButton).perform();
		
		WebElement delButton = driver.findElement(By.xpath("//span[contains(text(),'Del')]"));
		
		//act.click(delButton).perform();
		delButton.click();
		
		Thread.sleep(5000);
		//Alert
		Alert deleteAlert = driver.switchTo().alert();
		
		String alertText = deleteAlert.getText();
		System.out.println(alertText);
		Assert.assertTrue(alertText.contains("delete"));
		
		Thread.sleep(3000);
		deleteAlert.accept();
		
	}
	
	
	
	@Test
	public void DoubleClickTest() throws Exception {
		
		
		
		WebElement doubleButton = driver.findElement(By.xpath("//button[contains(text(),'Dou')]"));
		
		act.doubleClick(doubleButton).perform();
		
		
		
		Thread.sleep(5000);
		//Alert
		Alert doubleAlert = driver.switchTo().alert();
		
		String alertText = doubleAlert.getText();
		System.out.println(alertText);
		Assert.assertTrue(alertText.contains("double"));
		
		Thread.sleep(3000);
		doubleAlert.dismiss();
		
	}

}
