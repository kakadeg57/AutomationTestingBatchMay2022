package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;



public class DealPage extends TestBase{
	
	// Page factory
	public DealPage() {
		PageFactory.initElements(driver, this);
	}
	
	// WebElents repository
	@FindBy(name = "title")
	WebElement title;
	@FindBy(name = "amount")
	WebElement amount;
	@FindBy(name = "identifier")
	WebElement identifier;
	@FindBy(name = "tags")
	WebElement tags;
	@FindBy(name = "description")
	WebElement description;
	@FindBy(name = "next_step")
	WebElement nextStep;
	@FindBy(xpath = "//input[@value='Save and Create Another']/preceding-sibling::input")
	WebElement saveBtn;
	
	@FindBy(xpath = "(//td[@class='tabs_header'])[1]")
	WebElement dealTxt;
		// Actions
	public void createDealPage(String ttl,String amt,String idf,String tgs,String descr,String nstep) {
		title.sendKeys(ttl);
		amount.sendKeys(amt);
		identifier.sendKeys(idf);
		tags.sendKeys(tgs);
		description.sendKeys(descr);
		nextStep.sendKeys(nstep);
		saveBtn.click();
	}
	public String dealNameText() {
		return dealTxt.getText();
	}

}
