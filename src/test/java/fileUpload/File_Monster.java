package fileUpload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Constants;

public class File_Monster {
	
	
	
	@Test
	public void verifyFileUpload() {
		
		//WebDriver driver = WebDriverManager.chromedriver().create();
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get(Constants.URL_monster);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement file_upload = driver.findElement(By.id("file-upload"));
		
		
		//autoIT - desktop 
		//record - generate script
		//execute script ----exe
		
		
		file_upload.sendKeys("C:\\Users\\Act\\OneDrive\\Desktop\\Playwright_Course_Overview.pdf");
		
		
		
		
		
	}

}
