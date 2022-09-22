package jScript_example;


import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ExecuteJavascriptExamples {
    private WebDriver          driver;
    private JavascriptExecutor js;

    @Before
    public void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
    }

	/*
	 * @Test public void T01_calculatorJavaScriptTest() throws Exception {
	 * driver.navigate().to("http://www.anaesthetist.com/mnm/javascript/calc.htm");
	 * driver.manage().window().maximize(); //1-) Click "9"
	 * driver.findElement(By.name("nine")).click();
	 * 
	 * //2-) Click "+" driver.findElement(By.name("add")).click();
	 * 
	 * //3-) Click "3" driver.findElement(By.name("three")).click();
	 * 
	 * //4-) Declare JavaScriptExecutor and call "Calculate()" function
	 * js.executeScript("Calculate();");
	 * 
	 * //5-) Assert that result is 12 WebElement result =
	 * driver.findElement(By.name("Display")); Assert.assertEquals("12",
	 * result.getAttribute("value")); Thread.sleep(5000); }
	 */

    @Test
    public void T02_jsExamples() throws Exception {
        driver.navigate().to("https://www.amazon.in/");

        //JS alert
        js.executeScript("alert('Amazon - Learning !');");
        driver.switchTo().alert().accept();
        Thread.sleep(1000);

        //JS get title
        String title = js.executeScript("return document.title;").toString();
        Assert.assertEquals(title, driver.getTitle());
        Thread.sleep(1000);

        //JS Refresh
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("history.go(0);");
        Thread.sleep(2000);

        //JS Scroll
        WebElement amazonBrand = driver.findElement(By.xpath("//h2[text()='Up to 70% off | Amazon Brands & more']"));
        WebElement internationalBrand = driver.findElement(By.xpath("//h2[text()='Up to 70% off | International brands']"));
        js.executeScript("arguments[0].scrollIntoView(true);", internationalBrand);
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView(true);", amazonBrand);

        //JS Highlight
        js.executeScript("arguments[0].style.border='3px dotted blue'", amazonBrand);
        Thread.sleep(1000);

        //JS hide an element
        js.executeScript("document.querySelector('div#main-content>div:nth-of-type(19)>div>div>h2').style.display='none'");
        Thread.sleep(1000);

        //JS show an element
        js.executeScript("document.querySelector('div#main-content>div:nth-of-type(19)>div>div>h2').style.display='block'");
        Thread.sleep(1000);

        //JS click and type text
        js.executeScript("document.querySelector('input#twotabsearchtextbox').value = 'Iphone'");
        js.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("input#nav-search-submit-button")));
        
        Thread.sleep(1000);

        //JS Navigate to Other Page
        js.executeScript("window.location = 'https://www.flipkart.com/'");
        Thread.sleep(1000);
    }

	/*
	 * @Test public void T03_createAnAnonymousFunction() {
	 * driver.navigate().to("https://www.swtestacademy.com");
	 * 
	 * //Create an anonymous function //Change title with JavascriptExecutor
	 * js.executeScript("document.title='Title is changed manually!';");
	 * Assert.assertEquals("Title is changed manually!", driver.getTitle());
	 * 
	 * //Create an anonymous function that will stored and added into the global
	 * window js.
	 * executeScript("window.changeTitle = function(){document.title='Title is changed by function!';};"
	 * + "window.changeTitle.call();");
	 * Assert.assertEquals("Title is changed by function!", driver.getTitle());
	 * 
	 * //Change title manually
	 * js.executeScript("document.title='Title is changed manually!';");
	 * Assert.assertEquals("Title is changed manually!", driver.getTitle());
	 * 
	 * //Change title with Function js.executeScript("window.changeTitle.call();");
	 * Assert.assertEquals("Title is changed by function!", driver.getTitle()); }
	 */

    @After
    public void quitDriver() {
        driver.quit();
    }
}