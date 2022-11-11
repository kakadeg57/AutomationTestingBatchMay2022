package crmpropages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class NewContactPage extends TestBase {
	public NewContactPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[contains(text(),'Contact Information')]")
	WebElement newContact;
	
	@FindBy(xpath = "//*[contains(@name,'first_name')]")
	WebElement firstNameText;
	
	@FindBy(xpath = "//*[contains(@name,'surname')]")
	WebElement lastNameText;
	
	@FindBy(xpath = "//*[contains(@name,'address_title')]")
	WebElement addressText;
	
	@FindBy(xpath = "//*[contains(@name,'mobile')]")
	WebElement contactText;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[1]/td/input[2]")
	WebElement saveBtn;
	
	@FindBy(xpath = "(//*[@class='tabs_header'])[1]")
	WebElement saveName;
	
	public String newContact() {
		return newContact.getText();
	}
	public void createContact(String firstname,String lastname,String addrss,String contact) {
		firstNameText.sendKeys(firstname);
		lastNameText.sendKeys(lastname);
		addressText.sendKeys(addrss);
		contactText.sendKeys(contact);		
	}
	public void createContactSave() {
		saveBtn.click();
	}
	public String saveNameText() {
		return saveName.getText();
		
	}
}
