package com.introselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Google_page2 extends Base {

		By searchGoogle = By.name("q");
		By primerLink = By.xpath("//a[@href='https://www.selenium.dev/']");
		By buttonSearch = By .xpath("//input[@name='btnK']");
		By headerFirstPAge = By .xpath("//h1");
		public Google_page2(WebDriver driver) {
		super(driver);
	}
		
		public void SearchInGoogle() {
			click(searchGoogle);
			type("Selenium", searchGoogle);
			WaitForElement(buttonSearch);
			click(buttonSearch);
			WaitForElement(primerLink);
			click(primerLink);
			
		}

		public void SeleniumSearchTest(){
			WaitForElement(headerFirstPAge);
			String header = driver.getTitle();
			Assert.assertTrue(header.contains("SeleniumHQ Browser Automation"));
			Assert.assertTrue(header.contains("Selenium"));	
		}

		public void assertAttributesGoogleHomePage() {
			String page = driver.getTitle();
			Assert.assertTrue(page.contains("Google"));
		}//

			

}
