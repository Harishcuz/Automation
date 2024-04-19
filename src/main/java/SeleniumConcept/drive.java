package SeleniumConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drive {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Believerz\\Automation\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();   // browser launch 
	DataDriverFrameworkConcept obj = new DataDriverFrameworkConcept();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();   // maximizing  browser
	driver.get("https://www.google.com/search?q=IND+VS+ENG&source=hp&ei=SrVPYIDUEceM4-EPhMC0gA0&iflsig=AINFCbYAAAAAYE_DWsNCZb6Qn4as5DVrRYOsSZ7ZdlHn#sie=m;/g/11qppm0z77;5;/m/021q23;cms;fp;1;;");
	Thread.sleep(3000);
	

	List<WebElement> searchTextBox=driver.findElements(By.xpath("//table[@class='//t']/thead/tr/th"));
	//searchTextBox.sendKeys(obj.readingValueFromExcel().get(4).get("username"));
	for(int i=0;i<searchTextBox.size();i++) {
	System.out.println(searchTextBox.get(i).getText());
	}
	
}
}
