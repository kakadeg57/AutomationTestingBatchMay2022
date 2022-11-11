package crmprotest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.TestBase;
import crmpropages.HomePage;
import crmpropages.LoginPage;

public class LoginPageTest extends TestBase{	
	LoginPage login;
	HomePage home;
  @BeforeMethod
  public void intialization() {
	  init();
	  login = new LoginPage(); 
	  home = new HomePage();
  }
  
  @Test(priority = 1)
  public void validateLoginPageTest() {
	  login.login(prop.getProperty("username"),prop.getProperty("password"));
	  home.logoutTxt();
     Assert.assertEquals(home.logoutTxt(), "  Logout  ");
	
  }
  @Test (priority = 2)
  public void validateLogoImgTest() {
	 boolean isdisplayed = login.logoImg();
	Assert.assertEquals(isdisplayed, true);
	  
  }
  @Test(priority = 3)
  public void validateGetTitleTest() {
	  String title =login.getTitle();
	  Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
  }
  @Test(priority = 4)
  public void validateForgetPasswordTest() {
	  login.forgetPassword();
	  String forgetpass = login.fPassword();
	  Assert.assertEquals(forgetpass, "Privacy Policy");
  }

  @AfterMethod
  public void closeResources() {
	  driver.close();
  }
}
