package testScripts;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class DatePickerExample3 {

    @Test

    public void dateTimePicker(){

    	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://demo.automationtesting.in/Datepicker.html");

        //Find the date time picker control

        WebElement dateBox = driver.findElement(By.xpath("//input[@class='form-control is-datepick']"));

        //Fill date as mm/dd/yyyy as 09/25/2021

        dateBox.sendKeys("09/25/2021");

        //Press tab to shift focus to time field

        dateBox.sendKeys(Keys.TAB);

        

    }

    }