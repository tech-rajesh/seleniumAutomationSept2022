package recap;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RutoExample extends BaseTest{

	
	
	@Test
	public void login() {
		
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		
		driver.findElement(By.cssSelector("input#Password")).clear();
		driver.findElement(By.cssSelector("input#Password")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@name='RememberMe']")).click();
		driver.findElement(By.tagName("button")).click();
		
	}

}
