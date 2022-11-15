package crmtest;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.CompanyPage;
import crmpages.DealPage;
import crmpages.HomePage;
import crmpages.LoginPage;


public class DealPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	DealPage dealpage;
	
	
	@BeforeMethod
	public void initialization() {
		init(); // this method will create instance of Chrome browser > and loads FreeCRM loginpage
		loginPage = new LoginPage(); // it will create object of LoginPage
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password")); 
		// with help of loginPage object login method will be executed and it will return homepage object
		dealpage = homePage.clickOnNewDeal();
	}
	
	
	
	@Test
	public void validatenewdealTest() {
		dealpage.newdealentry();
	}
	
	
	@AfterMethod
	public void closeResources() {
		driver.close();
	}

}



