package com.introselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Heroku_page extends Base {

    By pageTitle = By.xpath("//h1[@id='notLoggedTitleTXT']");
    By pageSubTitle = By.xpath("//h3[@id='notLoggedScreen']");
    By buttonLogin = By.xpath("//button[@id='loginBTN']");
    By emailInput = By.xpath("//input[@id='username']");
    By passInput = By.xpath("//*[@id='password']");
    By buttonContinueLogin = By.xpath("//button[@name='action']");
    By buttonLogout = By.xpath("//button[@id='logoutBTN']");
    By buttonLoremIpsum = By.xpath("//a[@href='/lorem/']");
    By buttonTesting = By.xpath("//a[@href='/forms/']");
    By footerLocatedButton = By.cssSelector(".footerClass > p");
    By welcomeText = By.xpath("//p[@id='profileTXT']");
    By avatarUser = By.xpath("//img[@id='profileIMG']");
    By newsSection = By.xpath("//*[@id='news']");
    By hiddentext = By.xpath("//*[@id='hiddenText1']");
    By lorumSection1 = By.xpath("//*[@id='headingObj1']");
    By lorumSection2 = By.xpath("//*[@id='headingObj2']");
    By lorumSection3 = By.xpath("//*[@id='headingObj3']");
    By lorumSection4 = By.xpath("//*[@id='headingObj4']");
    By linkSelenium = By.xpath("//a[@href='https://www.selenium.dev/']");
    By linkYoutube = By.xpath("//a[@href='https://www.youtube.com/']");
    By linkFacebook = By.xpath("//a[@href='https://www.facebook.com/']");
    By sameWindow = By.xpath("//*[@target='_self']");
    By completePage = By.xpath("//*[@id='root']");
    By alert = By.xpath("//span[@id='alert-trigger']");
    By buttonForms = By.xpath("//a[@href='/lorem/']");
    By formsField1First = By.xpath("//input[@id='TXTUser']");
    By formsField2Last = By.xpath("//input[@id='TXTPass']");
    By formsField3Nick = By.xpath("//input[@id='TXTNick']");
    By formsField4Email = By.xpath("//input[@id='TXTEmail']");
    By formsField5Url = By.xpath("//input[@id='TXTUrl']");
    By formsField6Mobile = By.xpath("//input[@id='TXTMobile']");
    By formsField7PersonalTitle = By.xpath("//select[@id='SELTitle']");
    By personalTitle1 = By.xpath("*[@id='SELTitle']/option[1]");
    By personalTitle2 = By.xpath("*[@id='SELTitle']/option[2]");
    By personalTitle3 = By.xpath("*[@id='SELTitle']/option[3]");
    By personalTitle4 = By.xpath("*[@id='SELTitle']/option[4]");
    By formsField8About = By.xpath("//*[@id='TXTAbout']");
    By formsField9Developer = By.xpath("//*[@id='RADButDevYes']");
    By formsField9aNotDeveloper = By.xpath("//*[@id='RADButDevNo']");
    By submitButton = By.xpath("//input[@id='BTNSubmit']");
    By finalPaginaIpsum = By.xpath("//*[@id='titleScreen']/div[3]/div[3]");
    By validation1FirstName = By.xpath("//*[@id='FirstName']");
    By validation2LastName = By.xpath("//*[@id='LastName']");
    By validation3NickName = By.xpath("//*[@id='NickName']");
    By validation4Developer = By.xpath("//*[@id='Developer']");
    By validation5Mobile = By.xpath("//*[@id='Mobile']");
    By validation6Mail = By.xpath("//*[@id='Email']");
    By validation7About = By.xpath("//*[@id='About']");
    By validation8Url = By.xpath("//*[@id='Url']");
    By validation9Title = By.xpath("//*[@id='Title']");


    public Heroku_page(WebDriver driver) {
        super(driver);
    }

    public void herokuLogin1() {
        WaitForElement(buttonLogin);
        click(buttonLogin);
        WaitForElement(emailInput);
        WaitForElement(passInput);
        type("Password", passInput);
        click(buttonContinueLogin);
        checkIfElementisDisplayed(alert);    
    }

    public void herokuLogin2() {
        WaitForElement(buttonLogin);
        click(buttonLogin);
        WaitForElement(emailInput);
        type("Password", emailInput);
        click(buttonContinueLogin);
        checkIfElementisDisplayed(alert);
    }

    public void herokuLogin3() {
        WaitForElement(buttonLogin);
        click(buttonLogin);
        WaitForElement(emailInput);
        type("Password", emailInput);
        type("Password", passInput);
        click(buttonContinueLogin);
        checkIfElementisDisplayed(alert);
    }

    public void herokuLoginOk() {
        WaitForElement(buttonLogin);
        checkIfElementisDisplayed(buttonLogin);
        click(buttonLogin);
        WaitForElement(emailInput);
        type("bcappadoro@gmail.com", emailInput);
        WaitForElement(passInput);
        type("accACC123-+-", passInput);
        click(buttonContinueLogin);
        WaitForElement(completePage);
    }

    public void logOutButton() {
        WaitForElement(buttonLogout); 
        checkIfElementisDisplayed(buttonLogout);
    }

    public void welcomeTextAndAvatar() {
        WaitForElement(welcomeText);
        String text = getText(welcomeText);
        Assert.assertTrue(text.contains("Welcome "));
        checkIfElementisDisplayed(welcomeText);
        WaitForElement(avatarUser);
        checkIfElementisDisplayed(avatarUser);
    }

    public void assertAttributesHomePage() {
        String page = driver.getTitle();
        Assert.assertTrue(page.contains("Home Page"));
    }

    public void assertFooter() {
        WaitForElement(footerLocatedButton);
        String textInput = getText(footerLocatedButton);
        Assert.assertTrue(textInput.contains("Disclaimer: This project is a personal site meant to be used as a help test site to be able to perform some automation test on demand."));
    }

    public void LogInButtonAvailable() {
        WaitForElement(buttonLogin);
        checkIfElementisDisplayed(buttonLogin);
    }

    public void TextHomePage() {
        String text = getText(completePage);
        Assert.assertTrue(text.contains("Welcome to my Automation Testing Site"));
        Assert.assertTrue(text.contains("Please click Login button to log into the application or sign up!"));
    }

    public void herokuClickLoremIpsum() {
        WaitForElement(buttonLogout);
        checkIfElementisDisplayed(buttonLoremIpsum); 
        click(buttonLoremIpsum);
    }

    public void herokuClickTestingForms() {
        WaitForElement(buttonLogout);
        checkIfElementisDisplayed(buttonTesting); 
        click(buttonTesting);
    }

    public void checkNews() {
        WaitForElement(newsSection);
        checkIfElementisDisplayed(newsSection);
    }

    public void hiddenTextValidation() {
        WaitForElement(hiddentext);
        String hiddentexto = getAttribute(hiddentext, "textContent");
        Assert.assertTrue(hiddentexto.equals("Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."));
    }

    public void homeTitleLoremIpsum() {
         String page = driver.getTitle();
         Assert.assertTrue(page.contains("Lorem Ipsum Page"));
    }

    public void validarSecciones() {
        WaitForElement(lorumSection1);
        checkIfElementisDisplayed(lorumSection1);
        checkIfElementisDisplayed(lorumSection2);
        checkIfElementisDisplayed(lorumSection3);
        checkIfElementisDisplayed(lorumSection4);
   }

   public void linksVisible() {
        WaitForElement(linkSelenium);
        ScrollToElement(finalPaginaIpsum);
        checkIfElementisDisplayed(linkSelenium);
        checkIfElementisDisplayed(linkFacebook);
        checkIfElementisDisplayed(linkYoutube);
    }

    public void ingresarLinkSelenium() {
        WaitForElement(linkSelenium);
        ScrollToElement(finalPaginaIpsum);
        click(linkSelenium);
    } 

    public void verificarPagSelenium() {
        WaitForElement(linkSelenium);
        ScrollToElement(finalPaginaIpsum);
        String selfvalue = getAttribute(linkSelenium, "target");
        Assert.assertTrue(selfvalue.equals("_self"));
        click(linkSelenium);
    } 
  
    public void ingresarLinkFacebook() {
        WaitForElement(linkFacebook);
        ScrollToElement(finalPaginaIpsum);
        String selfvalue = getAttribute(linkFacebook, "target");
        Assert.assertTrue(selfvalue.equals("_self"));
        click(linkFacebook);
    } 

    public void ingresarLinkYotube() {
        WaitForElement(linkYoutube);
        ScrollToElement(finalPaginaIpsum);
        String selfvalue = getAttribute(linkYoutube, "target");
        Assert.assertTrue(selfvalue.equals("_self"));
        click(linkYoutube);
    } 

    public void homeTitleForms() {
        String page = driver.getTitle();
        Assert.assertTrue(page.contains("Forms Page"));
    }

    public void fillForms() {
        WaitForElement(formsField1First);
        type("Brenda", formsField1First);
        type("Cappadoro", formsField2Last);
        type("Bren", formsField3Nick);
        type("bcappadoro@gmail.com", formsField4Email);
        type("www.bcappadoro.com", formsField5Url);
        type("3416430699", formsField6Mobile);
        ScrollToElement(submitButton);
        WaitForElement(submitButton);
        type("No se que contarte", formsField8About);
        selectDropdown(formsField7PersonalTitle, "Dr.");
        click(formsField9Developer);
    }

    public void clickSubmit() {
        scrolltoButtom();
        WaitForElement(submitButton);
        ScrollToElement(submitButton);
        click(submitButton);
    }

    public void validateFormInformation() {
    
        String text = getText(validation1FirstName);    
        Assert.assertTrue(text.contains("Brenda"));

        String text1 = getText(validation2LastName);    
        Assert.assertTrue(text1.contains("Cappadoro"));

        String text2 = getText(validation3NickName);    
        Assert.assertTrue(text2.contains("Bren"));

        String text3 = getText(validation4Developer);    
        Assert.assertTrue(text3.contains("si"));

        String text4 = getText(validation5Mobile);    
        Assert.assertTrue(text4.contains("3416430699"));

        String text5 = getText(validation6Mail);    
        Assert.assertTrue(text5.contains("bcappadoro@gmail.com"));

        String text6 = getText(validation7About);    
        Assert.assertTrue(text6.contains("No se que contarte"));

        String text7 = getText(validation8Url);    
        Assert.assertTrue(text7.contains("www.bcappadoro.com"));

        String text8 = getText(validation9Title);    
        Assert.assertTrue(text8.contains("Dr"));
    }


    public void logOut() {
        WaitForElement(buttonLogout); 
        click(buttonLogout);
    }

    public void assertAttributesResultPage() {
        String page = driver.getTitle();
        Assert.assertTrue(page.contains("Result Page"));
    }

}
