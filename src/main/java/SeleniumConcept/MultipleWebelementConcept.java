package SeleniumConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebelementConcept {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Believerz\\Automation\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();   // browser launch 
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();   // maximizing  browser
	driver.get("http://demo.automationtesting.in/Register.html");
	Thread.sleep(4000);
	
	List<WebElement> listofele=driver.findElements(By.xpath("//*[@type='checkbox']"));
	
	for(int i=0;i<listofele.size();i++) {
		listofele.get(i).click();
		Thread.sleep(1500);
	}
	
	for(WebElement f:listofele) {
		f.click();
		Thread.sleep(1500);
	}
		
}
}
