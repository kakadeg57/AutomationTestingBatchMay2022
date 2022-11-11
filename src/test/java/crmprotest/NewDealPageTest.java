package crmprotest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import crmpropages.HomePage;
import crmpropages.LoginPage;
import crmpropages.NewDealPage;

public class NewDealPageTest extends TestBase {
	
	
   LoginPage loginPage;
   HomePage homePage;
   NewDealPage newdealpage;
	@BeforeMethod
	public void intialization() {
	init();
	loginPage = new LoginPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	newdealpage = homePage.deallink();
	}
	@Test
	public void validateDealTest() {
	newdealpage.dealSave(prop.getProperty("dealname"), prop.getProperty("searchtext"));
	String dealsave = newdealpage.dealSaveText();
	Assert.assertEquals(dealsave, "deal1" );
	}	
	@AfterMethod
	public void closeResources() {
	driver.close();

	}
}
