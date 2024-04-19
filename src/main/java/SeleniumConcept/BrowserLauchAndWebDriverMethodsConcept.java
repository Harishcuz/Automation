package SeleniumConcept;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLauchAndWebDriverMethodsConcept {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\selva\\git\\repository3\\Automation\\dd\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();   // browser launch
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();   // maximizing  browser
		//Dimension d = new Dimension(300,400);
		//driver.manage().window().setSize(d);   // to set size of the  browser
		//driver.manage().window().setPosition(new Point(350,200));  to set position
		
		driver.get("https://www.google.com/");
        String title=driver.getTitle();
        System.out.println(title);
        
        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);
        
        String pageSource=driver.getPageSource();
        System.out.println(pageSource);
		Thread.sleep(2000);
		driver.quit();
		
	}
}
