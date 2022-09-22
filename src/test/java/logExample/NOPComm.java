package logExample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NOPComm extends BaseTest{
	
	
	
	@Test(priority = 1)
	public void verifyLogin() {
		
		log.info("verifyLogin - executuon in progress");
		
		driver.findElement(By.name("Email")).clear();
		log.info("username - cleared");
		
		driver.findElement(By.name("Email")).sendKeys(conf.getUserName());
		
		log.info("enter username: " + conf.getUserName());
		driver.findElement(By.cssSelector("input#Password")).clear();
		driver.findElement(By.cssSelector("input#Password")).sendKeys(conf.getPass());
		log.info("enter password: " + conf.getPass());
		driver.findElement(By.tagName("button")).click();
		log.info("click on login button");
		
		
	}
	
	
	@Test(priority = 3)
	public void verifyLogout() {
		
		log.info("click on logout button");
		driver.findElement(By.linkText("Logout")).click();
	}
	
	
	@Test(priority = 2)
	public void verifyAppTitle() throws Exception {
		Thread.sleep(4000);
		log.info("Validation of application title: " + driver.getTitle());
		String actualAppTitle = driver.getTitle();
		System.out.println("Application title: " + actualAppTitle);
		
		
	}

}
