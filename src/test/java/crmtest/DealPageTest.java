package crmtest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.DealPage;
import crmpages.HomePage;
import crmpages.LoginPage;

public class DealPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	DealPage dealPage;

	@BeforeMethod
	public void initialization() {
		TestBase.init();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		dealPage = homePage.clickOnNewDeal();
	}
	
	@Test
	public void validateDealTest() {
		dealPage.createDealPage("new deal1", "5", "ros", "@roshan", "This is a new deal", "deal will be completed soon");
		Assert.assertEquals(dealPage.dealNameText(), "new deal1");
	}
	
	
	@AfterMethod
	public void closeResources() {
		driver.close();
	}

}
