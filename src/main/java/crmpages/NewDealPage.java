package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import util.TestUtility;

public class NewDealPage extends TestBase{

	public NewDealPage() {
		PageFactory.initElements(TestBase.driver, this);
	}
	
	@FindBy(name="title")
	WebElement title;
	@FindBy(xpath="//*[@name='client_lookup']/following-sibling::input")
	WebElement companyLookup;
	@FindBy(xpath="//input[@name='search']")
	WebElement companySearch;
	@FindBy(xpath="//input[@name='search']/following-sibling::input")
	WebElement companyName;
	@FindBy(xpath="//a[text()='naturecyclellp']")
	WebElement selectCompany;
	@FindBy(xpath="//*[@name='contact_lookup']/following-sibling::input")
	WebElement contactLookup;
	@FindBy(name="by_client_id")
	WebElement checkbox;
	@FindBy(xpath="//input[@name='search']")
	WebElement contactName;
	@FindBy(xpath="//input[@name='search']/following-sibling::input")
	WebElement contactSearch;
	@FindBy(xpath="//*[contains(@href,'52902461')]")
	WebElement selectContact;
	@FindBy(name="amount")
	WebElement amount;
	@FindBy(name="probability")
	WebElement probability;
	@FindBy(name="commission")
	WebElement commission;
	@FindBy(name="identifier")
	WebElement identifier;
	@FindBy(name="product_id")
	WebElement product;
	@FindBy(xpath="//option[text()='ABCD']")
	WebElement selectProduct;
	@FindBy(name="type")
	WebElement type;
	@FindBy(xpath="//option[text()='New']")
	WebElement selectType;
	@FindBy(name="source")
	WebElement source;
	@FindBy(xpath="//option[text()='Online']")
	WebElement selectSource;
	@FindBy(name="tags")
	WebElement tags;
	@FindBy(name="description")
	WebElement description;
	@FindBy(name="next_step")
	WebElement nextStep;
	@FindBy(xpath="//*[@value='Save and Create Another']/preceding::input)[9]")
	WebElement saveBtn;
	
	@FindBy(xpath = "(//td[@class='tabs_header'])[1]")
	WebElement dealTxt;


	public void createDeal(String ttl,String companysearch,String contactname,String amt,String prob,String comm,String idf,String tgs,String descr,String nstep) {
	title.sendKeys(ttl);
	companyLookup.click();
	TestUtility.switchToWindow();
	companySearch.sendKeys(companysearch);
	companyName.click();
	selectCompany.click();
	TestUtility.returnToWindow();
	contactLookup.click();
	TestUtility.switchToWindow();
	checkbox.click();
	contactName.sendKeys(contactname);
	contactSearch.click();
	selectContact.click();
	TestUtility.returnToWindow();
	amount.sendKeys(amt);
	probability.sendKeys(prob);
	commission.sendKeys(comm);
	identifier.sendKeys(idf);
	product.click();
	selectProduct.click();
	type.click();
	selectType.click();
	source.click();
	selectSource.click();
	tags.sendKeys(tgs);
	description.sendKeys(descr);
	nextStep.sendKeys(nstep);
	saveBtn.click();
	}
	public String dealNameText() {
		return dealTxt.getText();
	}
}
