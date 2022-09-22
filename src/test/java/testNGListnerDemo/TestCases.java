package testNGListnerDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;             		

//@Listeners(testNGListnerDemo.ListnersTest.class)

public class TestCases {				
WebDriver driver;					

@BeforeTest
public void launch() {
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
}

//Test to pass as to verify listeners.		
@Test		
public void Login()				
{		
	
    driver.get("http://demo.guru99.com/V4/");					
    driver.findElement(By.name("uid")).sendKeys("1303");							
    driver.findElement(By.name("password")).sendKeys("Guru99");							
    driver.findElement(By.name("btnLogin")).click();					
}		

//Forcefully failed this test as verify listener.		
@Test		
public void TestToFail()				
{		
    System.out.println("This method to test fail");					
    Assert.assertTrue(false);			
}		
}