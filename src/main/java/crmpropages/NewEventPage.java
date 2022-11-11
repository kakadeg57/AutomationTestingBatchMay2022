package crmpropages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class NewEventPage extends TestBase{

	public NewEventPage() {
		PageFactory.initElements(driver,this );
	}
	
	@FindBy(xpath = "//*[contains(text(),'Event Information ')]")
	WebElement eventInfo;
	
	@FindBy(xpath = "//*[@name='title']")
	WebElement titleNewEvent;
	
	@FindBy(xpath = "(//*[@class='button'])[12]")
	WebElement saveBtnEvent;
	
	@FindBy(xpath = "//*[@onclick='addMember();']")
	WebElement addSpeker;
	
	@FindBy(xpath = "//*[contains(text(),' Event:')]")
	WebElement saveBtnText;
	public String eventinfo() {
		String event = eventInfo.getText();
		return event;
	}
	public void saveEvent(String eventname) {
		titleNewEvent.sendKeys(eventname);
		addSpeker.click();
		saveBtnEvent.click();
	}
	public String eventSaveText() {
		return saveBtnText.getText();
	}
	
	
	
	
}
