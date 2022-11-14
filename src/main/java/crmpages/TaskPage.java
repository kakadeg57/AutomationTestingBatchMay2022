package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class TaskPage extends TestBase{
	
	public TaskPage() {
		PageFactory.initElements(TestBase.driver, this);
	}
	
	
	@FindBy(xpath = "//*[@name='title']")
	WebElement title;
	@FindBy(xpath = "//*[@name='completion']")
	WebElement completion;
	@FindBy(xpath = "//*[@name='identifier']")
	WebElement identifier;
	@FindBy(xpath = "//*[@name='tags']")
	WebElement tags;
	@FindBy(xpath = "//*[@name='description']")
	WebElement description;
	@FindBy(xpath = "(//*[@name='description']/following::input)[2]")
	WebElement saveBtn;
	
	@FindBy(xpath = "(//td[@class='tabs_header'])[1]")
	WebElement taskTxt;
	
	public void createTaskPage(String titl,String compl,String idf,String tgs,String descr) {
		title.sendKeys(titl);
		completion.sendKeys(compl);
		identifier.sendKeys(idf);
		tags.sendKeys(tgs);
		description.sendKeys(descr);
		saveBtn.click();
	}
	public String taskNameText() {
		return taskTxt.getText();
	}
	
	

}
