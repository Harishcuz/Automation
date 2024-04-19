package SeleniumConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModelConcept {
	public PageObjectModelConcept(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='email']")
	public WebElement FBUserName;
	
	@FindBy(xpath="//*[@id='pass']")
	public WebElement FBPass;
	
	@FindBy(xpath="//*[@id='u_0_d_nq']")
	public WebElement FBClick;
	
	@FindBy(xpath="//input[@name='q']")
	public WebElement txtBx;
	
	@FindBy(xpath="//*[@class='o3j99 LLD4me yr19Zb LS8OJ']")
	public WebElement OutsideClick;
	
	@FindBy(xpath="(//*[@class='gNO89b'])[2]")
	public WebElement CLickSearchEng;
	
}
