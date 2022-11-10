package crmtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.HomePage;
import crmpages.LoginPage;
import util.TestUtility;

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
		loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		TestUtility.switchToMainPannelFrame();
		Assert.assertEquals(homePage.logoutButtonText(), "  Logout  ");
	}
	
	
	@Test(priority = 2)
	public void validateLoginPageLogoTest() {
		boolean isDisplayed = loginPage.logoImage();
		Assert.assertEquals(isDisplayed, true);
		
	}
	
	@Test(priority = 3)
	public void validateLoginPageTitleTest() {
		String value = loginPage.loginPageTitle();
		Assert.assertEquals(value, "Free CRM - CRM software for customer relationship management, sales, and support.");
	}
	
	@AfterMethod
	public void closeResources() {
		driver.close();
	}
		
}
