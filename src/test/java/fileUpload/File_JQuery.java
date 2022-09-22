package fileUpload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Constants;

public class File_JQuery {
	
	
	
	@Test
	public void verifyFileUpload() {
		
		//WebDriver driver = WebDriverManager.chromedriver().create();
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get(Constants.URL_jQuery);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement file_upload = driver.findElement(By.cssSelector("[type='file']"));
		
		
		//autoIT - desktop 
		//record - generate script
		//execute script ----exe
		
		
		file_upload.sendKeys("C:\\Users\\Act\\OneDrive\\Desktop\\SopraSteria_Sept\\images\\WebDriver.png");
		//file_upload.sendKeys("C:\\Users\\Act\\OneDrive\\Desktop\\Playwright_Course_Overview.pdf");
		
		
		
		driver.findElement(By.xpath("//span[text()='Start upload']")).click();
		
		
	}

}
