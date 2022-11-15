package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class DealPage extends TestBase{
public void CreateNewDeal() {
		
		PageFactory.initElements(driver,this);
	}
       
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[2]/td[1]/table/tbody/tr[7]/td[1]/strong")
    WebElement newdealpage;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[2]/input")
    WebElement Title;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[2]/td[1]/table/tbody/tr[7]/td[2]/input")
    WebElement Commision;
    
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[1]/td/input[1]")
    WebElement Savebtn;
	
	
	
	public void newdealvalidation() {
		  
	  }
	
	public void newdealentry() {
		
		Title.sendKeys("Speedway");
		Commision.sendKeys("100");
		Savebtn.click();
		  
	  }
}


  