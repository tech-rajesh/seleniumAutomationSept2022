package windowExample;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IRCTCExample extends BaseTest{
	
	
	
	@Test
	public void verifyFrameTest() throws Exception {
		
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window: " + parentWindow);
		
		
		//click on Ok button
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		//click on hotel tab
		driver.findElement(By.linkText("HOTELS")).click();
		
		//============================================================================================//
		
		Set<String> allWindow  =driver.getWindowHandles();
		
		
		System.out.println("No of windows opened: " + allWindow.size());
		
		String mainWindow = (String) allWindow.toArray()[0];
		String hotelWindow = (String) allWindow.toArray()[1];
		
		
		System.out.println("Main Window: " + mainWindow);
		System.out.println("Hotel Window: " + hotelWindow);
		
		
		
		Thread.sleep(5000);
		//Switch to Hotel window
		driver.switchTo().window(hotelWindow);
		
		//click on login
		driver.findElement(By.linkText("Login")).click();
		
		
		Thread.sleep(5000);
		//Switch to Main window
		driver.switchTo().window(mainWindow);
		
		
		System.out.println(driver.getTitle());
		//Assert.assertNotEquals(driver.getTitle(), "");
		
		
		//click on ContactUS
		driver.findElement(By.linkText("CONTACT US")).click();
		
		Thread.sleep(5000);
		//Switch to Hotel window
		driver.switchTo().window(hotelWindow);
		
		//click on login
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
	}

}
