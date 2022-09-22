package recap;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NOPCommTest extends BaseTest {
	
	@Test
	public void login() {
		
		
		txtEmail = driver.findElement(By.cssSelector(".email"));
		txtEmail.clear();
		txtEmail.sendKeys(conf.getUserName());
		
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(conf.getPass());
		
		
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		
		
		
	}
	
}
