package com.introselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Facebook_page extends Base {

    By emailInput = By.xpath("//input[@name='email']");
    By passInput = By.xpath("//input[@name='pass']");
    By buttonLogin = By.xpath("//button[@name='login']");
    By forgotPassword = By.xpath("//*[contains(text(),'Olvidado la contraseña?')]");

    public Facebook_page(WebDriver driver) {
        super(driver);
        //TODO Auto-generated constructor stub
    }


    public void facebookLogin() {
        
        WaitForElement(emailInput);
        type("fakeemail123@whatever.com", emailInput);
        WaitForElement(passInput);
        type("Fakepassword", passInput);
        click(buttonLogin);
    
    }

    public void assertAttributes() {
        WaitForElement(forgotPassword);
        String textInput = getAttribute(forgotPassword,"href");
        Assert.assertTrue(textInput.contains("https"));
    }


    
}
