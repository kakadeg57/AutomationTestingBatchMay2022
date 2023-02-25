package crmtest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import base.TestBase;
import crmpages.HomePage;
import crmpages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	@BeforeMethod
	public void initialization() {
		init();
		loginPage = new LoginPage();
		homePage = new HomePage();
	}
	
	
	@Test(priority = 1)
	public void validateLoginTest() {
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		//Assert.assertEquals(homePage.logoutButtonText(), " Logout ");
	}
	
	
	@Test(priority = 2)
	public void validateLoginPageLogoTest() {
		boolean isDisplayed = loginPage.logoImage();
		Assert.assertEquals(isDisplayed, true);
		
	}
	
	@Test(priority = 3)
	public void validateLoginPageTitleTest() {
		String value = loginPage.loginPageTitle();
		Assert.assertEquals(value, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	
	@AfterMethod
	public void closeResources() {
		driver.close();
	}
		
}
