package crmpropages;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import util.TestUtility;

public class NewDealPage extends TestBase{
 
	public NewDealPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[contains(text(),'Deal')])[5]")
	WebElement dealText;
	
	@FindBy(xpath = "//*[@id='title']")
	WebElement dealNem;
	
	@FindBy(xpath="(//*[@value='Lookup'])[1]")
	WebElement lookUp;
	
	@FindBy(xpath = "//*[@name='search']")
	WebElement searchText;
	
	@FindBy(xpath = "//*[@type='submit']")
	WebElement searchBtn;
	
	@FindBy(xpath = "//*[contains(text(),'TCS Pune')]")
	WebElement selectText;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[1]/td/input[1]")
	WebElement saveBtn;
	
	@FindBy(xpath = "(//*[@class='tabs_header'])[1]")
	WebElement saveText;
	public String dealText() {
	   return dealText.getText();
	}
	public void dealSave(String dealname,String searchtext) {
		dealNem.sendKeys(dealname);
		String parenthandle = driver.getWindowHandle();
		lookUp.click();
		   Set<String> handles = driver.getWindowHandles();
		   for(String handle:handles) {
				if(!handle.equals(parenthandle)) {
					driver.switchTo().window(handle);
					searchText.sendKeys(searchtext);
					searchBtn.click();
					selectText.click();
				}
		   }
		   driver.switchTo().window(parenthandle);
		TestUtility.switchToFreame();
		saveBtn.click();	
	}
	public String dealSaveText() {
		return saveText.getText();
	}
}
