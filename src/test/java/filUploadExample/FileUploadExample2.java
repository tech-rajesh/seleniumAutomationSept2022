package filUploadExample;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadExample2 {

	@Test
	public void fileUpload() {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); // for page load
		d.get("https://www.monsterindia.com/seeker/registration");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // for Implicit wait

		WebElement browse = d.findElement(By.xpath("//input[@id='file-upload']"));
		// click on ‘Choose file’ to upload the desired file
		browse.sendKeys("D:\\temp_delete\\demoFTP.txt"); // Uploading the file using sendKeys
		System.out.println("File is Uploaded Successfully");

	}

}