package SeleniumConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FrameConcept {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Believerz\\AutomationProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   // browser launch 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();   // maximizing  browser
		driver.get("http://demo.automationtesting.in/Frames.html");
		Thread.sleep(4000);
		
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys("selva");
		Thread.sleep(4000);

		driver.switchTo().defaultContent();
		Thread.sleep(4000);

		Actions d = new Actions(driver);
		
		WebElement widgets=driver.findElement(By.xpath("//*[text()='Widgets']"));
		d.moveToElement(widgets).build().perform();
		Thread.sleep(4000);
		
		driver.quit();
         
	}
}
