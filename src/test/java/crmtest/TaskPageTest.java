package crmtest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.HomePage;
import crmpages.LoginPage;
import crmpages.TaskPage;

public class TaskPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TaskPage taskPage;
	
	@BeforeMethod
	public void initialization() {
		TestBase.init();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		taskPage = homePage.clickOnNewTask();
		
	}
	
	@Test
	public void validateTaskPageTest() {
		taskPage.createTaskPage("New Task","20","ros232","@Roshan,@Ganesh","This is new task for the month of december");
		Assert.assertEquals(taskPage.taskNameText(), "New Task");
		System.out.println("New task- "+taskPage.taskNameText()+" created successfully");
	}
	
	@AfterMethod
	public void closeResources() {
		driver.close();
	}

}
