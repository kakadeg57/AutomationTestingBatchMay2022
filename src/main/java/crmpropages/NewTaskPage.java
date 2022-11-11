package crmpropages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class NewTaskPage extends TestBase{

	public NewTaskPage() {
		PageFactory.initElements(driver, this);
	}
    @FindBy(xpath = "//*[contains(text(),'Task Information')]")
    WebElement newTaskText;
    
    public String newTaskText() {
    	return newTaskText.getText();
    }
}
