package util;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.TestBase;

public class TestUtility extends TestBase{
	
	public static XSSFWorkbook worksheet;
	
	public static void switchToMainPannelFrame() {
		driver.switchTo().frame("mainpanel");
	}

	public static void mouseHover(WebElement elementName) {
		Actions act = new Actions(driver);
		act.moveToElement(elementName).build().perform();
	}
	
	
	
	
	
	
	public static String[][] getData(){
		// this method will read and return excel sheet data into test scripts
		try {
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\AutomationFrameworkBatchMay\\contactData.xlsx"); // reading this file
		worksheet = new XSSFWorkbook(file); // we are reading this file as excel workbook
		}
		catch(Exception e) {
			System.out.println("Test data file is not available under project, please add");
		}
		XSSFSheet sheet = worksheet.getSheet("data");
		 int row = sheet.getLastRowNum(); //4
		 int column = sheet.getRow(0).getLastCellNum(); //4
		 String data[][] = new String[row][column];
		 for(int i = 0;i<row; i++) { // to iterate from one row to another 
			 for(int j =0;j<column; j++) { // to iterate from one column to another
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
			 }
		 }
		return data;
	}
	
	
	public void ExplicitWait() {
		// we will use this method to apply explicit wait to specific web element
	}
	
	public void switchToWindow() {
		
	}
		public void sreenshot() {
		
	}

}
