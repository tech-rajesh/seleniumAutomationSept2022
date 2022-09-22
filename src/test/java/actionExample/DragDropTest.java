package actionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DragDropTest extends BaseTest{
	
	
	@Test
	public void drag_drop_test() {
		
		
		//concept - missing
		
		WebElement photoFrame = driver.findElement(By.xpath("//iframe[contains(@data-src,\"photo\")]"));
		driver.switchTo().frame(photoFrame);
		
		
		
		WebElement img3 = driver.findElement(By.xpath("//img[contains(@src,'tatras3')]"));
		WebElement img4 = driver.findElement(By.xpath("//img[contains(@src,'tatras4')]"));
		WebElement trash = driver.findElement(By.cssSelector("div#trash"));
		
		//App -1 -----direct method
		act.dragAndDrop(img3, trash).perform();
		//act.dragAndDrop(img4, trash).perform();
		
		
		//App-2 
		//A convenience method that performs click-and-hold at the location of the source element, 
		//moves to the location of the target element, then releases the mouse.
		
		act.clickAndHold(img4).moveToElement(trash).release().perform();
		//act.clickAndHold(img4).moveToElement(trash).release().build().perform();
		
				
		
	}

}
