package basicTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {
	
	
	@Test
	public void test1() {
		
		
		//System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		//WebDriver driver = new ChromeDriver();
		
			
		
		driver.get("https://www.amazon.in/");
		
	}

}
