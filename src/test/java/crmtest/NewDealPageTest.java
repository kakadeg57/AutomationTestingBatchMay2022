package crmtest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.NewDealPage;
import crmpages.HomePage;
import crmpages.LoginPage;

public class NewDealPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	NewDealPage newDealPage;
	@BeforeMethod
	public void initialization()	{
		TestBase.init();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		newDealPage = homePage.clickOnNewDeal1();
	}
	
	@Test
	public void validateDeal_PageTest1() {
		newDealPage.createDeal("Deal no.1", "nat", "roshan", "250000", "100", "0.5", "@ros", "roshan", "this is a new deal for december", "deal will completed soon");
		Assert.assertEquals(newDealPage.dealNameText(), "Deal no.1");
	}
	
	
	@AfterMethod
	public void closeResources() {
		driver.close();
	}
	
}
