package crmprotest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.TestBase;
import crmpropages.HomePage;
import crmpropages.LoginPage;
import crmpropages.NewTaskPage;

public class NewTaskPageTest extends TestBase {
	LoginPage loginPage;
	   HomePage homePage;
	   NewTaskPage newtaskpage;
		@BeforeMethod
		public void intialization() {
		init();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		newtaskpage = homePage.taskLink();
		}
		@Test
		public void validateDealTest() {
		System.out.println("taskpage");
		}	
		@AfterMethod
		public void closeResources() {
		driver.close();

		}
}
