package recap;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {
	
	
	
	
	
	@Test
	public void login() {
		
		System.out.println("login test case");
	}

	
	@Test
	public void verifyAppTitle() {
		
		System.out.println("verifyAppTitle test case");
	}
	
	
	//@Test(retryAnalyzer = RetryLogic.class)
	
	@Test
	public void payment() {
		
		
		//int x = 10/0;
		//Assert.assertTrue(false);
		System.out.println("payment test case");
		
		
	}
	
	@Test
	public void searchItems() {
		
		Assert.assertTrue(false);
		System.out.println("addItems test case");
	}
}
