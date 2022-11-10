package crmtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;

public class DealPageTest extends TestBase {
	
	

	@BeforeMethod
	public void initialization() {
		
	}
	
	
	
	@Test
	public void validateDealTest() {
		System.out.println("successfully validated");
	}
	
	
	@AfterMethod
	public void closeResources() {
		
	}

}
