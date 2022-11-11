package crmprotest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import crmpropages.HomePage;
import crmpropages.LoginPage;
import crmpropages.NewContactPage;
import util.TestUtility;

public class NewContactPageTest extends TestBase{
 
	LoginPage loginPage;
    HomePage homepage;
    NewContactPage contactpage;
	@BeforeMethod
	public void intialization() {
		init();
		loginPage = new LoginPage();
		homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactpage = homepage.contactBtn();
	}
	@DataProvider(name = "contactdata")
	public String[][] contactDataProvider() {
		return TestUtility.getData();
	}
	@Test(dataProvider = "contactdata")
	public void ValidateCreateContactTest(String firstname,String lastname,String contact,String address) {
		contactpage.createContact(firstname,lastname,contact,address);
		contactpage.createContactSave();
		String savenametext = contactpage.saveNameText();
		Assert.assertEquals(savenametext,firstname+" "+lastname);
	}
	
	@AfterMethod
	public void closeResources() {
		driver.close();
	}
}
