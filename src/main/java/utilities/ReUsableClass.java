package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ReUsableClass {

	public static WebDriver driver;
	@BeforeTest
	public static WebDriver  browserLaunch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Believerz\\AutomationProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
	    Thread.sleep(3000);
		return driver;
	}
	
	public static void closeDriver() {
		driver.close();
	}
	
	@AfterTest
	public static void quitDriver() {
		driver.quit();
	}
	
	public static void click(WebElement element) throws InterruptedException {
		element.click();
	    Thread.sleep(3000);
	}
	
	public static void sendKeys(WebElement element, String value) throws InterruptedException {
		element.clear();
		element.sendKeys(value);
		Thread.sleep(3000);
		
	}
	
	
public static String getText(WebElement element) throws InterruptedException {
		
		String value=element.getText();
		Thread.sleep(3000);
		return value;

	}

      public static void dropDown(WebElement element, int index) throws InterruptedException {
    	  Select s = new Select(element);
    	  s.selectByIndex(index);
  		Thread.sleep(3000);
	}
      
      public static void dropDown(WebElement element, String value) throws InterruptedException {
    	  Select s = new Select(element);
    	  s.selectByValue(value);
  		Thread.sleep(3000);

	}
      
      public static void elementToBeClickable(WebElement element) {

    		WebDriverWait t= new WebDriverWait(driver, 20);    // explicit wait
    		t.until(ExpectedConditions.elementToBeClickable(element));
	}
	
}
