package seleniumCon;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObject.CalendarPageObject;
import utilities.ReUsableClass;

public class BrowserLaunch extends ReUsableClass{

	public CalendarPageObject objRepositories;
	@Test
	public void launchBrowser() throws InterruptedException {
		objRepositories = new CalendarPageObject(driver);
	   /* click(objRepositories.clkClose);		
	    sendKeys(objRepositories.txtMobile, "mobile");
	    click(objRepositories.clckSearch);	
	    assertEquals(getText(objRepositories.validateMobileAccesories), "Mobiles & Accessories");*/
		 click(objRepositories.btnSignUp);	
		 dropDown(objRepositories.ddnDate, 1);
		 dropDown(objRepositories.ddnMon, "11");
		 dropDown(objRepositories.ddnyr, 32);
		 
		 click(objRepositories.ssssfff);	

	}
	
	
		
		
	
}
