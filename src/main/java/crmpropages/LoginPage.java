package crmpropages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import util.TestUtility;

public class LoginPage extends TestBase {
//	to initializa web element - pagefactory method -> inside constructor  
	
	public LoginPage() {
		PageFactory.initElements(driver , this);
	}
//	Page object Repository (POM)
 @FindBy(xpath = "//*[@placeholder='Username']")
 WebElement usernameTxt;
 
 @FindBy(xpath = "//*[@placeholder='Password']")
 WebElement passwordtxt;
 
 @FindBy(xpath = "//*[@value='Login']")
 WebElement loginBtn; 
 
 @FindBy(xpath = "//*[contains(@src,'logo')]")
 WebElement logoImg;
 
 @FindBy(xpath = "//*[contains(text(),'Forgot')]")
 WebElement forgetpass;

 @FindBy(xpath = "//*[text()='Privacy Policy']")
 WebElement fPass;
 
public Boolean logo;
 
//	Actions
 
 public HomePage login(String username,String password) {
	 usernameTxt.sendKeys(username);
	 passwordtxt.sendKeys(password);
	 loginBtn.click();
	 TestUtility.switchToFreame();
	 return new HomePage();
 }
 public boolean logoImg() {
	boolean logo = logoImg.isDisplayed();
	 return logo  ;
 }
 public String getTitle() {
	String title = driver.getTitle();
	return title;			
 }
public void forgetPassword() {
	forgetpass.click();
}
public String fPassword() {
	return fPass.getText();
}



}

