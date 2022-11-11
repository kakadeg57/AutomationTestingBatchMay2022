package crmprotest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import crmpropages.HomePage;
import crmpropages.LoginPage;
import crmpropages.NewComponyPage;

public class NewComponyPageTest extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	NewComponyPage newcomponypage;
	@BeforeMethod
	public void intialization() {
		init();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		newcomponypage = homepage.componyBtn();
	}
	
	@Test
	public void validateNewComponyTest() {
		newcomponypage.ComponySave(prop.getProperty("componyname"), prop.getProperty("industruname"), prop.getProperty("revenue"));
	    String comSave = newcomponypage.componySaveText();
	    Assert.assertEquals(comSave,"All");
	}
	
	@AfterMethod
	public void closeResources() {
		driver.close();
	}
}
