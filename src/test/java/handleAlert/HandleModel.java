package handleAlert;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class HandleModel extends BaseTest{
	
	
	
	@Test()
	public void verifyModelTest() throws Exception {
		
		
		//Modal generated
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Launch')]")).click();
		
		
		//driver.switchTo()   ----- not required
		
		Thread.sleep(4000);
		
		String actualHeading = driver.findElement(By.cssSelector("h4.modal-title")).getText();
		String actualBody = driver.findElement(By.cssSelector(".modal-body")).getText();
		
		System.out.println("Heading: " + actualHeading);
		System.out.println("Body: " + actualBody);
		
		
		
		//click on Ok button
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File target = new File("./screenshot/modalDialog.png");
		
		FileUtils.copyFile(screenshotFile, target);
		
		
	//	Assert.assertEquals("", "");
		
	}

}
