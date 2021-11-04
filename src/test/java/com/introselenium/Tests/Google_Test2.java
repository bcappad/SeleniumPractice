package com.introselenium.Tests;

import com.introselenium.Google_page2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Google_Test2 {
	
	public WebDriver driver;
	Google_page2 googlepage;
	
	@BeforeTest
	public void setUp() throws Exception {
		googlepage = new Google_page2(driver);
		driver = googlepage.chromeDriverConnection();
		driver.manage().window().maximize();
		googlepage.visit("https://www.google.com");		
	}
	
	/////////////		EJERCICIO #1		/////////////
	
	@Test
	public void googleValidation() throws InterruptedException {
		googlepage.assertAttributesGoogleHomePage();
	}

	@Test
	public void searchSeleniumValidations() throws InterruptedException {
		googlepage.SearchInGoogle();
		googlepage.SeleniumSearchTest();
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		//driver.quit();
	}	
	
}