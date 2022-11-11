package util;

import java.io.FileInputStream;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class TestUtility extends TestBase {

	 public static  XSSFWorkbook worksheet;
	 public static String[][] getData(){
		try {
		FileInputStream file = new FileInputStream("D:\\files\\User ajay\\Eclipse\\eclipse-workspace\\AutomationTestingFramework\\Untitled spreadsheet.xlsx");
		worksheet = new XSSFWorkbook(file);} 
		catch (Exception e) {
			System.out.println("Test data  file not under project please add");
		}
		XSSFSheet sheet = worksheet.getSheet("data");
		int row ;
		row = sheet.getLastRowNum();
		
		int column;
		column = sheet.getRow(0).getLastCellNum();
		String data[][]= new String[row][column];
		for (int i = 0; i <row;i++) {
			for (int j = 0; j <column; j++) {
	    data[i][j] = sheet.getRow(i+1).getCell(j).toString();
	    
			}
			
		}
		return data;	
	}
	 public static void switchToFreame() {
		 driver.switchTo().frame("mainpanel");	
	}
	public static void mouseHoverAction(WebElement elementname) {
		Actions actions = new Actions(driver);
		actions.moveToElement(elementname).build().perform();
	}
	public static void dropDown(WebElement elmenetnamedd,String valueName) {
		    Select sel = new Select(elmenetnamedd);
		    sel.selectByValue(valueName);
	}
	public void explicitWait() {
		
	}
	
	public static void switchToWindow() {
		 String parenthandle = driver.getWindowHandle();
		 
		   Set<String> handles = driver.getWindowHandles();
		   for(String handle:handles) {
				if(!handle.equals(parenthandle)) {
					driver.switchTo().window(handle);
				}
		   }
		   driver.switchTo().window(parenthandle);
	}
	
	
}
