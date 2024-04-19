package SeleniumConcept;

import java.lang.ref.PhantomReference;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MouseOverActions {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Believerz\\Automation\\driver\\chromedriver.exe");
		/*DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);*/
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();   // browser launch 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();   // maximizing  browser
		driver.get("https://www.flipkart.com/");
		Actions mouseAction = new Actions(driver);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();

		WebElement mouseOverElement=driver.findElement(By.xpath("//*[text()='Electronics']"));
		mouseAction.moveToElement(mouseOverElement).perform();
		
		WebElement clickingMouseOverElement=driver.findElement(By.xpath("//*[text()='Health & Personal Care']"));
		mouseAction.click(clickingMouseOverElement).perform();

		Thread.sleep(6000);
		driver.quit();
	}
}
