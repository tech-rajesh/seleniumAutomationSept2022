package handleAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleListTest extends BaseTest{

	@Test
	public void list1() throws Exception {
		
		
		WebElement multiSlect = driver.findElement(By.xpath("//select[@name=\"FromLB\"]"));
		
		
		//Select 
		
		Select li = new Select(multiSlect);
		
		
		
		//methods - from select class
		
		System.out.println("is element accept multiple selction or not: " + li.isMultiple());
		
		
		//index --- 0
		li.selectByIndex(0);				//USA
		li.selectByValue("India");			//India
		li.selectByVisibleText("Spain");	//Spain
		
		
		Thread.sleep(3000);
		//deselect
		li.deselectByValue("USA");
		
		System.out.println(li.getAllSelectedOptions().size());
		
		
	}
	
	
	@Test
	public void list2() throws Exception {
		
		
		WebElement singleSelect = driver.findElement(By.tagName("select"));			//mutiple matches - by default first one
		
		
		//Select 
		
		Select li = new Select(singleSelect);
		
		
		
		//methods - from select class
		
		System.out.println("is element accept multiple selction or not: " + li.isMultiple());			//false
		
		
		//index --- 0
		li.selectByIndex(1);				//Saab
		Thread.sleep(2000);
		li.selectByValue("USA");			//Volvo
		Thread.sleep(2000);
		li.selectByVisibleText("Toyota");	//Toyota
		
		
				
		System.out.println(li.getAllSelectedOptions().size());
		
		
	}
	
}
