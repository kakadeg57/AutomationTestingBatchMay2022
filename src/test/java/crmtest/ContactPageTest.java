package crmtest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.ContactPage;
import crmpages.HomePage;
import crmpages.LoginPage;
import util.TestUtility;

public class ContactPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	ContactPage contactPage;
	
	@BeforeMethod
	public void initialization() {
		init(); // init method will create instance of chrome and launch URL
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactPage = homePage.clickOnNewContact();
	}
	
	@DataProvider(name = "contactData")
	public String [][] contactDataProvider() {
		String [][] data =  TestUtility.getData();
		return data;
	}
	
	@Test(dataProvider = "contactData")
	public void validateCreateContactTest(String firstName,String lastName,String address, String mobileNumber) {
		
		contactPage.createContact(firstName, lastName, address,mobileNumber);
		Assert.assertEquals(contactPage.getCreatedContactNameText(), firstName+" "+lastName  );
	}
	
	
	@Test()
	public void validateDemoTest() {
		System.out.println("this is second test of contact page");
	}
	
	@AfterMethod
	public void closeResources() {
		driver.close();
	}
	

}
