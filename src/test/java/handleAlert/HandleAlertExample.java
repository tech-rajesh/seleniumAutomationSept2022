package handleAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleAlertExample extends BaseTest{

	
	
	@Test
	public void promptAlert() throws Exception {
		
		
		//click on Prompt Button
		driver.findElement(By.cssSelector("button#prompt")).click();
		
		
		Thread.sleep(4000);
		//Alert
		//SwitchTo
		//Alert/frame/windows
		//accept/dismiss/getText/sendKeys
		
		String name = "SuperMan";
		
		
		Alert promptAlert = driver.switchTo().alert();
		
		promptAlert.sendKeys(name);
		
		promptAlert.accept();	//click on OK button 
		
		
		
		String actualResult = driver.findElement(By.cssSelector("#demo")).getText();
		
		Boolean verifyResult = actualResult.contains(name);
		System.out.println("validation step: " + verifyResult);
		
	}
	
	
	
}
