package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import util.TestUtility;

public class HomePage extends TestBase{
	
//1)// to initialize web elements - pagefactory method initElements-> inside constructor
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
//2) // page objects repository 
	@FindBy(xpath = "/html/body/table[1]/tbody/tr[2]/td[1]/div/table/tbody/tr/td[4]/a")
	WebElement logoutBtn;
	
	@FindBy(xpath = "/html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[4]/a")
	WebElement contact;
	
	@FindBy(xpath = "/html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[4]/ul/li[1]/a")
	WebElement newContact;
	
	@FindBy(xpath = "/html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[3]/a")
	WebElement company;
	@FindBy(xpath = "/html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[3]/ul/li[1]/a")
	WebElement newCompany;
	
	@FindBy(xpath = "//a[text()='Tasks']")
	WebElement task;
	@FindBy(xpath = "//a[@title='New Task']")
	WebElement newTask;
	

//3) // actions 
	public void logout() {
		TestUtility.switchToMainPannelFrame();
		logoutBtn.click();
	}
	
	public ContactPage clickOnNewContact() {
		TestUtility.switchToMainPannelFrame();
		TestUtility.mouseHover(contact);
		newContact.click();
		return new ContactPage();
	}
	public CompanyPage clickOnNewCompany() {
		TestUtility.switchToMainPannelFrame();
		TestUtility.mouseHover(company);
		newCompany.click();
		return new CompanyPage();
	}
	public TaskPage clickOnNewTask() {
		TestUtility.switchToMainPannelFrame();
		TestUtility.mouseHover(task);
		newTask.click();
		return new TaskPage();
	}
	
	
	public String logoutButtonText() {
		
	 String txt = logoutBtn.getText();
	 return txt;
	}

}
