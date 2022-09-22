package testScripts;
import java.time.MonthDay;
import java.util.Date;

import org.apache.poi.ss.formula.functions.Now;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DatePickerTests  {
    
	
	
	@Test
    public void turkishAirlinesDatePicker() throws Exception {
        
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        //Click and open the Date Picker
        driver.findElement(By.id("datepicker")).click();
        
        
        
        
        
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-datepicker-title")));
        
        
        
        
        
        
        String YearMonthValue = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println("*****" + YearMonthValue);//October 2021
        String month = YearMonthValue.split(" ")[0].trim();
        String year = YearMonthValue.split(" ")[1].trim();
        
        
//        String yearInput = "1990";
//        String monthInput = "01";
        
        
        
        //System.out.println(MonthDay);
        
        //month
        //current data
        
        while(!(month.equals("September") && year.equals("2024"))) {
        	
        	driver.findElement(By.xpath("//a[@title='Next']")).click();
        	
        	
        	
        	
        	
        	YearMonthValue = driver.findElement(By.className("ui-datepicker-title")).getText();
        	System.out.println("*****" + YearMonthValue);//October 2021
             month = YearMonthValue.split(" ")[0].trim();
             year = YearMonthValue.split(" ")[1].trim();
        	
        }
        
        driver.findElement(By.xpath("//a[text()='23']")).click();
		
    }
}