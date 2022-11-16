package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CompanyPage extends TestBase{
	public CompanyPage() {
		PageFactory.initElements(TestBase.driver, this);
	}
	
	@FindBy(xpath = "//legend[text()='Create New  Company']")
	WebElement createNewCompanyTxt;
	
	@FindBy(xpath = "//*[@name='company_name']")
	WebElement company;
	@FindBy(xpath = "//*[@name='industry']")
	WebElement industry;
	@FindBy(xpath = "//*[@name='annual_revenue']")
	WebElement revenue;
	@FindBy(xpath = "//*[@name='num_of_employees']")
	WebElement employees;
	@FindBy(xpath = "//*[@name='identifier']")
	WebElement identifier;
	@FindBy(xpath = "//*[@name='vat_number']")
	WebElement taxNumber;
	@FindBy(xpath = "//*[@name='phone']")
	WebElement phone;
	@FindBy(xpath = "//*[@name='fax']")
	WebElement fax;
	@FindBy(xpath = "//*[@name='website']")
	WebElement website;
	@FindBy(xpath = "//*[@name='email']")
	WebElement email;
	@FindBy(xpath = "//*[@name='symbol']")
	WebElement symbol;
	@FindBy(xpath = "//*[@name='client_lookup']")
	WebElement parentCompany;
	@FindBy(xpath = "//*[@name='address_title']")
	WebElement addressTitle;
	@FindBy(xpath = "//*[@name='address']")
	WebElement address;
	@FindBy(xpath = "//*[@name='city']")
	WebElement city;
	@FindBy(xpath = "//*[@name='state']")
	WebElement state;
	@FindBy(xpath = "//*[@name='postcode']")
	WebElement zipcode;
	@FindBy(xpath = "//*[@name='country']")
	WebElement country;
	@FindBy(xpath = "//*[@name='tags']")
	WebElement tags;
	@FindBy(xpath = "//*[@name='service']")
	WebElement description;
	@FindBy(xpath = "(//td[@align='center'])[4]/child::input")
	WebElement saveBtn;
	
	@FindBy(xpath = "(//td[@class='tabs_header'])[1]")
	WebElement companyName;
	

	// WebElents repository
	
	
	// Actions
	public HomePage createCompany(String cmp,String ind,String rvn ,String emp,String idf,String txn, String phn,String fx,String wbs,String ml,String sml,String pcmp,String attl,String ad,String ct,String st,String zcd,String cntr,String tg,String dsc) {
		company.sendKeys(cmp);
		industry.sendKeys(ind);
		revenue.sendKeys(rvn);
		employees.sendKeys(emp);
		identifier.sendKeys(idf);
		taxNumber.sendKeys(txn);
		phone.sendKeys(phn);
		fax.sendKeys(fx);
		website.sendKeys(wbs);
		email.sendKeys(ml);
		symbol.sendKeys(sml);
		parentCompany.sendKeys(pcmp);
		addressTitle.sendKeys(attl);
		address.sendKeys(ad);
		city.sendKeys(ct);
		state.sendKeys(st);
		zipcode.sendKeys(zcd);
		country.sendKeys(cntr);
		tags.sendKeys(tg);
		description.sendKeys(dsc);
		saveBtn.click();
		HomePage hm = new HomePage();
		return hm;
	}
	public String contactNameTxt() {
		return companyName.getText();
	}

}
