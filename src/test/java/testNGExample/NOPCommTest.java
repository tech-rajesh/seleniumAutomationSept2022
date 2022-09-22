package testNGExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NOPCommTest {
	
	
	//pre-condition  ----- @Before
	//@Test -----  testcase
	//post-condition -----@After
	
	//ctrl+shift+O - remove/add import
	
	//control execution workflow
	
	
	//Priority ------ TestNG
	//By default priority - 0   ----- same 
	//Highest negative number - having highest priority 
	//If priority is same, execution as per naming con ----alphabetic order
	
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("launching app......");
	}
	
	@AfterTest
	public void closeApp() {
		
		System.out.println("closing app......");
	}
	
	@Test(priority = 1)
	public void login() {
		
		System.out.println("login testcase");
	}
	
	@Test(priority = 4)
	public void logout() {
		
		System.out.println("logout testcase");
	}
	
	@Test(priority = 2)
	public void additems() {
		
		System.out.println("additems testcase");
	}

	
	@Test(priority = 3)
	public void payment() {
		
		System.out.println("payment testcase");
	}
	
	
	
	@Test(priority = 3)
	public void cancelOrder() {
		
		System.out.println("cancelOrder testcase");
	}
}
