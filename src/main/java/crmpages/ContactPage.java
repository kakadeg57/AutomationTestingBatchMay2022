package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ContactPage extends TestBase{
	
	// page factory method
	public ContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Object repository:
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/legend")
	WebElement labelText;
	
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[2]/input")
	WebElement firstName;
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[2]/td[1]/table/tbody/tr[4]/td[2]/input")
	WebElement lastName;
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[3]/td/fieldset/table/tbody/tr/td/table/tbody/tr[4]/td[2]/textarea")
	WebElement address;
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[2]/td[2]/table/tbody/tr[4]/td[2]/input")
	WebElement mobileNumber;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[1]/td/input[2]")
	WebElement saveBtn;
	
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[1]")
	WebElement contactName;
	// action
	
	public void createContact(String name, String surname,String add, String number) {
		firstName.sendKeys(name);
		lastName.sendKeys(surname);
		address.sendKeys(add);
		mobileNumber.sendKeys(number);
		saveBtn.click();
	}
	
	public String getCreatedContactNameText() {
		return contactName.getText();
	}
	
	public String getlabelText() {
		return labelText.getText();
	}

}
