package crmtest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.CompanyPage;
import crmpages.HomePage;
import crmpages.LoginPage;

public class CompanPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	CompanyPage companyPage;
	
	
	@BeforeMethod
	public void initialization() {
		init(); // this method will create instance of Chrome browser > and loads FreeCRM loginpage
		loginPage = new LoginPage(); // it will create object of LoginPage
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password")); 
		// with help of loginPage object login method will be executed and it will return homepage object
		companyPage = homePage.clickOnNewCompany();
	}
	
	
	
	@Test
	public void validateCompanyTest() {
		companyPage.createCompany("abc", "manufacturing", "1", "5", "--", "GSTIN-121212", "9874561230", "1212", "abc.com", "abc@gmail.com", "abc", "--","Shipping Address" , "xyz charkop kandivali(W)", "Kandivali", "Maharashtra", "400067", "India", "Roshan", "Hello I'm abc llp");
		Assert.assertEquals(companyPage.contactNameTxt(), "abc");
		System.out.println("Company "+companyPage.contactNameTxt()+"created successfully");
	}
	
	
	@AfterMethod
	public void closeResources() {
		driver.close();
	}

}
