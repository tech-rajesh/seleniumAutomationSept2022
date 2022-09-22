package testNGListnerDemo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class Utility extends HRMLoginTest{

	public Utility(WebDriver driver) throws Exception {
		
		this.driver = driver;
		
		
		
	}
	
	public static void getScreenShot(ITestResult result) throws Exception {
		
		String dateName_number = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./screenshot/FailedTestCase_"+result.getName()+"-" +dateName_number+"_.png"));
	}

}
