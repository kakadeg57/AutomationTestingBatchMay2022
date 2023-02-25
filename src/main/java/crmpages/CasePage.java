package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CasePage extends TestBase{
	public CasePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="Title")
	WebElement title;
	@FindBy()
	WebElement title1;
	@FindBy()
	WebElement title2;
	@FindBy()
	WebElement title3;
	@FindBy()
	WebElement title4;
	
	@FindBy()
	WebElement casePageTxt;
	public void createCasePage(String ttl,String ttl1,String ttl2,String ttl3,String ttl4) {
		title.sendKeys(ttl);
		title1.sendKeys(ttl1);
		title2.sendKeys(ttl2);
		title3.sendKeys(ttl3);
		title4.sendKeys(ttl4);
	}
	public String validateCasePageText() {
		return casePageTxt.getText();
	}
}
