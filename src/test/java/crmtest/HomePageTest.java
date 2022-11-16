package crmtest;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.ContactPage;
import crmpages.HomePage;
import crmpages.LoginPage;
import crmpages.TaskPage;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	ContactPage contactPage;
	TaskPage taskPage;
	@BeforeMethod
	public void initialization() {
		init(); // this method will create instance of Chrome browser > and loads FreeCRM loginpage
		loginPage = new LoginPage(); // it will create object of LoginPage
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password")); 
		// with help of loginPage object login method will be executed and it will return homepage object
		contactPage = new ContactPage();
	}
	
	@Test
	public void validateLogoutTest() {
		
		homePage.logout(); // it will click on logout button
		Assert.assertEquals(loginPage.loginPageTitle(), "Free CRM - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test
	public void validateCreateContactLinkRedirection() {
		
		homePage.clickOnNewContact();
		String actualTxt = contactPage.getlabelText();
		Assert.assertEquals(actualTxt, "Contact Information");
	}
	
	@Test
	public void validateCreateCompanyLinkRedirection() {
		
		homePage.clickOnNewCompany();
	}
	@Test
	public void validateCreateTaskLinkRedirection() {
		homePage.clickOnNewTask();
	}
	
	@Test
	public void validateCreateCallLinkRedirection() {
		homePage.clickOnNewCase();
	}
//	
//	@Test
//	public void validateCreateTaskLinkRedirection() {
//		
//	}
	
	@AfterMethod
	public void closeResources() {
		driver.close();
	}
	
	
}
