package crmprotest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.TestBase;
import crmpropages.HomePage;
import crmpropages.LoginPage;
import crmpropages.NewComponyPage;
import crmpropages.NewContactPage;
import crmpropages.NewDealPage;
import crmpropages.NewEventPage;
import crmpropages.NewTaskPage;

public class HomePageTest extends TestBase{
	HomePage page;
	LoginPage lpage;
	NewEventPage newevent;
	NewComponyPage newcom;
	NewContactPage newcont;
	NewDealPage newdealpage;
	NewTaskPage newtaskpage;
	@BeforeMethod
	public void intialization() {
		init();		
		lpage = new LoginPage();
		newevent = new NewEventPage();
		newcom = new NewComponyPage();
		newcont = new NewContactPage();
		newdealpage = new NewDealPage();
		newtaskpage = new NewTaskPage();
		page = lpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void validateLogoutBtnTest() {
	page.logout();	
	Assert.assertEquals(lpage.getTitle(), "Free CRM - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test(priority = 2)
	public void validateDisplayedLogoTest() {
		boolean displayed = page.displayed();
		Assert.assertEquals(displayed, true);
	}
	
	@Test(priority = 3)
	public void validateUserNameTest() {
		String user = page.userName();
		Assert.assertEquals(user, "  User: GANESH KAKADE");
	}
	
	@Test(priority = 4)
	public void validateHomeLinkTest() {
		page.homeBtn();
		Assert.assertEquals(page.userName(), "  User: GANESH KAKADE");
	}
	
	@Test(priority = 5)
	public void validateCalenderlinktest() {
		page.calenderBtn();
		Assert.assertEquals(newevent.eventinfo(), "Event Information");
	}
	@Test(priority = 6)
	public void validateComponyLinkTest() {
		page.componyBtn();
		Assert.assertEquals(newcom.newCompony(), "Create New Company");
	}
	@Test(priority = 7)
	public void validateContactLinkTest() {
		page.contactBtn();
		Assert.assertEquals(newcont.newContact(), "Contact Information");
		
	}
	@Test(priority = 8)
	public void validateDealLinkTest() {
		page.deallink();
		String dealtext = newdealpage.dealText();
		Assert.assertEquals(dealtext, "Deal");
	}
	@Test(priority = 9)
	public void validateSetUpLinkTest() {
		page.setUpLink();
		String setupcheck = page.setUpCheck();
		Assert.assertEquals(setupcheck, "Global Account Administration");
	}
	@Test(priority = 10)
	public void validateTaskLinkTest() {
		page.taskLink();
		String newtasktext = newtaskpage.newTaskText();
		Assert.assertEquals(newtasktext, "Task Information");
	}
	
	@AfterMethod
	public void closeResources() {
		driver.close();
	}
}
