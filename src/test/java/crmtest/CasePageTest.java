package crmtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.CasePage;
import crmpages.HomePage;
import crmpages.LoginPage;



public class CasePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	CasePage casePage;
	
	@BeforeMethod
	public void initialiation() {
		TestBase.init();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		homePage.clickOnNewCase();
	}
	
	@Test
	public void validateCasePage() {
		
	}
	
	@AfterMethod
	public void closeResources() {
		
	}

}
