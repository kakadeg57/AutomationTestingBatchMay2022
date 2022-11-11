package crmpropages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import util.TestUtility;

public class NewComponyPage extends TestBase {
	public NewComponyPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//*[contains(text(),'Create New  Company')]")
	WebElement newCompony;
	
	@FindBy(css = "[name='company_name']")
	WebElement componyName;
	
	@FindBy(css = "[name='industry']")
	WebElement industrName;
	
	@FindBy(css = "[name='annual_revenue']")
	WebElement annualRevenue;
	
	@FindBy(css = "[name='status']")
	WebElement dropDownStatus;
	
	@FindBy(css = "[name='category']")
	WebElement ddCatagory;
	
	@FindBy(css = "[name='priority']")
	WebElement ddPriority;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[8]/td/input")
	WebElement saveCompony ;
	
	@FindBy(xpath = "//*[text()='All']")
	WebElement saveComponyText;
	
	public String newCompony() {
	   String com = newCompony.getText();
	   return com;
	}
	public void ComponySave(String componyname,String industruname,String revenue) {
		componyName.sendKeys(componyname);
		industrName.sendKeys(industruname);
		annualRevenue.sendKeys(revenue);
		TestUtility.dropDown(dropDownStatus, "Active");
		TestUtility.dropDown(ddCatagory, "Client");
		TestUtility.dropDown(ddPriority, "Medium");
		saveCompony.click();
	}
	public String componySaveText() {
		return saveComponyText.getText();
		
	}
}
