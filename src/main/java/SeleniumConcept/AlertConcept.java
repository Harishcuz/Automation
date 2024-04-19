package SeleniumConcept;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class AlertConcept {

	public static WebElement simpleAlert;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Believerz\\Automation\\driver\\chromedriver.exe");
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		@SuppressWarnings("deprecation")
		WebDriver driver = new ChromeDriver(capability);   // browser launch 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();   // maximizing  browser
		driver.get("https://demoqa.com/alerts");
		
		   simpleAlert=driver.findElement(By.xpath("//*[@id='alertButton']"));
		WebDriverWait t= new WebDriverWait(driver, 10);    // explicit wait
		t.until(ExpectedConditions.elementToBeClickable(simpleAlert));
		
		Wait<WebDriver> w= new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement d = w.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				//return driver.findElement(By.xpath("//*[@id='alertButton']"));
				return simpleAlert;
			}
		});
		simpleAlert.click();
		Thread.sleep(4000);
		/*WebElement confirmAlert=driver.findElement(By.xpath("//*[@id='confirmButton']"));
		confirmAlert.click();*/
		
	/*	WebElement promptAlert=driver.findElement(By.xpath("//*[@id='promtButton']"));
		promptAlert.click();
		
		Thread.sleep(4000);*/
		JavascriptExecutor js=(JavascriptExecutor)driver; 
	//	js.executeScript("alert('This is an alert');");
		Alert s = driver.switchTo().alert();
		
		s.accept();
		//s.dismiss();
		
		//s.sendKeys("selva");
		
		//s.dismiss();
		
		Thread.sleep(4000);
		driver.quit();

	}
}
