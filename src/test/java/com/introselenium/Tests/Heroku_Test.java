package com.introselenium.Tests;

import com.introselenium.Heroku_page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Heroku_Test {

	public WebDriver driver;
	Heroku_page herokuPage;
	
	@BeforeTest
	public void setUp() throws Exception {
		herokuPage = new Heroku_page(driver);
		driver = herokuPage.chromeDriverConnection();
		driver.manage().window().maximize();
		herokuPage.visit("https://testappautomation.herokuapp.com/");		
	}

	/////////////		EJERCICIO #2		/////////////
	
	// PUNTO 2: Validar página Un-logged
	@Test
	public void unloggedHomePageTitle() throws InterruptedException {
		herokuPage.assertAttributesHomePage();
	} // debe fallar

	@Test
	public void unloggedLogInButton() throws InterruptedException {
		herokuPage.LogInButtonAvailable();
	}

	@Test
	public void unloggedHomePageText() throws InterruptedException {
		herokuPage.TextHomePage();
	} // debe fallar porque está mal el nombre de la página

	@Test
	public void unloggedHyperlink1() throws InterruptedException {
		herokuPage.herokuClickLoremIpsum();
		herokuPage.TextHomePage();
	} // debe fallar porque está mal el nombre de la página

	@Test
	public void unloggedHyperlink2() throws InterruptedException {
		herokuPage.herokuClickTestingForms();
		herokuPage.TextHomePage();
	} // debe fallar porque está mal el nombre de la página

	// PUNTO 3: Validar footer
	@Test
	public void homePageFooter() throws InterruptedException {
		herokuPage.assertFooter();
	} 

	// PUNTO 4: Log in vacíos e inválido
	@Test
	public void loginUsuarioVacio() throws InterruptedException {
		herokuPage.herokuLogin1();
	}
	
	@Test
	public void loginPassVacio() throws InterruptedException {
		herokuPage.herokuLogin2();
	}

	@Test
	public void loginUsuarioInvalido() throws InterruptedException {
		herokuPage.herokuLogin3();
	}

	// PUNTO 5: Log in exitoso
	@Test
	public void loginExitoso() throws InterruptedException {
		herokuPage.herokuLoginOk();
	}
	
	// PUNTO 6: Validaciones del Log in exitoso
	@Test
	public void loginExitosoValidaciones() throws InterruptedException {
		herokuPage.herokuLoginOk();
		herokuPage.logOutButton();
		herokuPage.welcomeTextAndAvatar();
		herokuPage.assertAttributesHomePage();
	}// Está bien que falle porque hay un error en el título de la homepage

	/////////////		EJERCICIO #3		/////////////
	
	// PUNTO 1: Validar header y footer al ingresar a LoremIpsun
	@Test
	public void ingresarLoremIpsum() throws InterruptedException {
		herokuPage.herokuLoginOk();
		herokuPage.herokuClickLoremIpsum();
		herokuPage.assertFooter();
		herokuPage.logOutButton();
		herokuPage.welcomeTextAndAvatar();
	}

	// PUNTO 2: Validar header y footer al ingresar a LoremIpsun
	@Test
	public void validarSeccionNewsLoremIpsum() throws InterruptedException {
		herokuPage.herokuLoginOk();
		herokuPage.herokuClickLoremIpsum();
		herokuPage.checkNews();
	}

	// PUNTO 3: Validar hidden text al ingresar a LoremIpsun
	@Test
	public void validarHiddenText() throws InterruptedException {
		herokuPage.herokuLoginOk();
		herokuPage.herokuClickLoremIpsum();
		herokuPage.hiddenTextValidation();
	}

	// PUNTO 4: Validar título de la página al ingresar a LoremIpsun
	@Test
	public void pageTitleLoremIpsum() throws InterruptedException {
		herokuPage.herokuLoginOk();
		herokuPage.herokuClickLoremIpsum();
		herokuPage.homeTitleLoremIpsum();
	}
	
	// PUNTO 5: Validar secciones de la página al ingresar a LoremIpsun	
	@Test
	public void validarSeccionesLorem() throws InterruptedException {
		herokuPage.herokuLoginOk();
		herokuPage.herokuClickLoremIpsum();
		herokuPage.validarSecciones();
	}

	// PUNTO 6: Validar links de la página al ingresar a LoremIpsun
	@Test
	public void validarLinksvisibles() throws InterruptedException {
		herokuPage.herokuLoginOk();
		herokuPage.herokuClickLoremIpsum();
		herokuPage.linksVisible();
	}

	@Test
	public void linkSeleniumValidation() throws InterruptedException {
		herokuPage.herokuLoginOk();
		herokuPage.herokuClickLoremIpsum();
		herokuPage.verificarPagSelenium();
	}

	@Test
	public void linkFacebookValidation() throws InterruptedException {
		herokuPage.herokuLoginOk();
		herokuPage.herokuClickLoremIpsum();
		herokuPage.ingresarLinkFacebook();
	}

	@Test
	public void linkYoutubeValidation() throws InterruptedException {
		herokuPage.herokuLoginOk();
		herokuPage.herokuClickLoremIpsum();
		herokuPage.ingresarLinkYotube();
	} // Está bien que falle porque no abre en la misma página 
	
	/////////////		EJERCICIO #4		/////////////
	
	// PUNTO 1: Validar header y footer al ingresar a TestingForms
	@Test
	public void formsValidations() throws InterruptedException {
		herokuPage.herokuLoginOk();
		herokuPage.herokuClickTestingForms();
		herokuPage.assertFooter();
		herokuPage.logOutButton();
		herokuPage.welcomeTextAndAvatar();
	}

	// PUNTO 2: Validar título de página al ingresar a TestingForms
	@Test
	public void pageTitleForms() throws InterruptedException {
		herokuPage.herokuLoginOk();
		herokuPage.herokuClickTestingForms();
		herokuPage.homeTitleForms();
	}

	// PUNTO 3: Completar el formulario
	@Test
	public void fullfillForms() throws InterruptedException {
		herokuPage.herokuLoginOk();
		herokuPage.herokuClickTestingForms();
		herokuPage.fillForms();
	} 

	// PUNTO 4: Click en submit
	@Test
	public void submitForms() throws InterruptedException {
		herokuPage.herokuLoginOk();
		herokuPage.herokuClickTestingForms();
		herokuPage.fillForms();
		herokuPage.clickSubmit();
	}

	// PUNTO 5: validar page title y data igual a la ingresada
	@Test
	public void validateSuccesfulForms() throws InterruptedException {
		herokuPage.herokuLoginOk();
		herokuPage.herokuClickTestingForms();
		herokuPage.fillForms();
		herokuPage.clickSubmit();
		herokuPage.assertAttributesResultPage();
		// Está bien que falle porque el home title no es igual
	}

	@Test
	public void validaFormsInformation() throws InterruptedException {
		herokuPage.herokuLoginOk();
		herokuPage.herokuClickTestingForms();
		herokuPage.fillForms();
		herokuPage.clickSubmit();
		herokuPage.validateFormInformation();
	} // Esta bien que falle porque no muestra bien la información

	// PUNTO 6: Click en log-out y validar
	@Test
	public void logOutAfterForm() throws InterruptedException {
		herokuPage.herokuLoginOk();
		herokuPage.herokuClickTestingForms();
		herokuPage.fillForms();
		herokuPage.clickSubmit();
		herokuPage.logOut();
		herokuPage.assertAttributesHomePage();
		herokuPage.LogInButtonAvailable();
	} // está bien que falle porque está mal el nombre de la home page

	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}	   
}
