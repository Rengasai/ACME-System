package com.Acme.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Testcases {
	
	public static ChromeDriver driver;
	
	@Test
	public void acme() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
        Actions act=new Actions(driver);
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 	
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		WebElement path = driver.findElementByXPath("(//button[@class='btn btn-default btn-lg'])[4]");
		act.moveToElement(path).perform();
		Thread.sleep(2000);
		driver.findElementByLinkText("Search for Vendor").click();
		
		
		driver.findElementByXPath("//input[@id='vendorName']").sendKeys("Blue Lagoon");
		
		driver.findElementByXPath("//button[@id='buttonSearch']").click();
		
		driver.findElementByXPath("(//table[@class='table']//tr/following-sibling::tr/td)[5]").getText();
		
		
		
		
		
		
		
		
		
	}
	

}
