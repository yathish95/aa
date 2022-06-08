package com.truejet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class auto {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 String month ="Sep 2021";
		 driver.get("https://www.trujet.com/#/home");
		 driver.findElement(By.xpath("//input[@id='Fromval']")).sendKeys("chennai");
		 driver.findElement(By.xpath("//input[@id='Toval']")).sendKeys("hyderabad");
		 driver.findElement(By.xpath("//input[@placeholder='Departure']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
while(true)
	 {
 String text=driver.findElement(By.xpath("//div[@class='owl-dt-calendar-control-content']/button[@type='button']/span[1]")).getText();	 
	System.out.println(text);
	 if(text.equalsIgnoreCase(month))
	 {
		 break;
	 }
	 else
	 {
		 driver.findElement(By.xpath("//div[@class='owl-dt-calendar-control']/button[2]/span")).click();
		 break;
	 }
	 
	 }
driver.findElement(By.xpath("//div/owl-date-time-month-view/table/tbody/tr[3]/td[4]/span")).click();
		
		
		
		
	WebElement sd=	driver.findElement(By.xpath("//select[@name='adult']"));
		
	Select dp=new Select(sd);
	dp.selectByVisibleText("2");
	
	driver.findElement(By.xpath("//div[@class='form-btn'] //button[@class='submit-btn']")).click();
	
	}

}
