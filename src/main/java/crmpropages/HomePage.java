package crmpropages;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import util.TestUtility;

public class HomePage extends TestBase{

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[contains(text(),' Logout')]")
	WebElement logoutBtn;
	
	@FindBy(xpath = "//*[contains(text(),' GANESH')]")
	WebElement displayedUsrName;
	
	@FindBy(xpath = "//*[@class='logo_text']")
	WebElement dispalyedCRMPROLogo;
	
	@FindBy(xpath = "(//*[contains(text(),'Home')])[1]")
	WebElement homelink;
	
	@FindBy(xpath = "//*[contains(text(),'Calendar')]")
	WebElement calenderlink;
	
	@FindBy(xpath = "//*[contains(text(),'New Event')]")
	WebElement newEventlink;
	
	@FindBy(xpath = "(//*[contains(text(),'Companies')])[1]")
	WebElement componylink;
	
	@FindBy(xpath = "//*[contains(text(),'New Company')]")
	WebElement newComponyLink;
	
	@FindBy(xpath = "(//*[contains(text(),'Contacts')])[1]")
	WebElement contactlink;
    
	@FindBy(xpath = "//*[contains(text(),'New Contact')]")
	WebElement newContactlink;
	
	@FindBy(xpath = "//*[contains(text(),'Deals')]")
	WebElement deallink;

    @FindBy(xpath = "//*[contains(text(),'New Deal')]")
    WebElement newDealLink;
	
    @FindBy(xpath = "//*[contains(text(),'Setup')]")
    WebElement setupLink;
    
    @FindBy(xpath = "//*[contains(text(),'Global Account Administration')]")
    WebElement setupCheck;
    
    @FindBy(xpath = "(//*[contains(text(),'Tasks')])[1]")
    WebElement taskLink;
    
    @FindBy(xpath = "//*[contains(text(),'New Task')]")
    WebElement newTaskLink;
    
	public String logoutTxt() {
	return logoutBtn.getText();
	}
	public void logout() {
	   logoutBtn.click();	
	}
	public boolean displayed(){
	boolean displayed = dispalyedCRMPROLogo.isDisplayed();
	return displayed;
	}
	public void homeBtn () {
		homelink.click();
	}
	public void setUpLink() {
		setupLink.click();
	}
	public String userName() {
		return displayedUsrName.getText();	
	}
	public String setUpCheck() {
		return setupCheck.getText();
	}
	public NewEventPage calenderBtn() {
		TestUtility.mouseHoverAction(calenderlink);
		newEventlink.click();
		return new NewEventPage();
	}
	public NewComponyPage componyBtn() {
		TestUtility.mouseHoverAction(componylink);
		newComponyLink.click();
		return new NewComponyPage();
	}
	public NewContactPage contactBtn() {
		TestUtility.mouseHoverAction(contactlink);
		newContactlink.click();
		return new NewContactPage();
	}
	public NewDealPage deallink() {
		TestUtility.mouseHoverAction(deallink);
		newDealLink.click();
		return new NewDealPage();
	}
	
	public NewTaskPage taskLink() {
		TestUtility.mouseHoverAction(taskLink);
		newTaskLink.click();
		return new NewTaskPage();
	}
	
	
	
	
	
	
	
	
	
}
