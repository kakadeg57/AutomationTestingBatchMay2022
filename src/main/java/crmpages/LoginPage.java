package crmpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{
// to initialize web elements - pagefactory method initElements-> inside constructor
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
// page objects repository 
	
	// username text box 
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement usernameTxt;
	
	// password text box
	@FindBy(name="password")
	WebElement passwordTxt;
	
	// login button
	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginBtn;
	
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/a/img")
	WebElement logoImg;
	
	
// actions 
	public HomePage login(String username,String password){
		usernameTxt.sendKeys(username);
		passwordTxt.sendKeys(password);
		loginBtn.click();
		
		return new HomePage();
	}
	
	public boolean logoImage() {
		boolean status = logoImg.isDisplayed();
		return status;
	}
	
	public String loginPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
}
