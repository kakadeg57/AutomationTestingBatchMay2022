package crmprotest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import crmpropages.HomePage;
import crmpropages.LoginPage;
import crmpropages.NewEventPage;

public class NewEventPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	NewEventPage neweventpage;
	@BeforeMethod
	public void intialization() {
		init();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		neweventpage = homePage.calenderBtn();
	}
	@Test
	public void validateNewEventTest() {
		neweventpage.saveEvent(prop.getProperty("eventname"));
		String eventsavetext = neweventpage.eventSaveText();
		Assert.assertEquals(eventsavetext, "Event: teamhome");
	}
	@AfterMethod
	public void closeResources() {
		driver.close();
	}
}
