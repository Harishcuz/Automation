package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPageObject {

	public CalendarPageObject(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='_2KpZ6l _2doB4z']")
	public WebElement clkClose;
	
	@FindBy(xpath="//*[@name='q']")
	public WebElement txtMobile;

	@FindBy(xpath="//*[@class='L0Z3Pu']")
	public WebElement clckSearch;
	
    @FindBy(xpath="(//*[text()='Mobiles & Accessories'])[1]")
	public WebElement validateMobileAccesories;
    
    @FindBy(xpath="//*[text()='Create New Account']")
	public WebElement btnSignUp;
    
    
    		@FindBy(xpath="//*[@id='day']")
    		public WebElement ddnDate;
    		
    		@FindBy(xpath="//*[@name='birthday_month']")
    		public WebElement ddnMon;
    		
    		@FindBy(xpath="//*[@id='year']")
    		public WebElement ddnyr;
    		
    		@FindBy(xpath="///*ss")
    		public WebElement sfff;
    		
    		@FindBy(xpath="///*sssss")
    		public WebElement ssssfff;
			
	
}
