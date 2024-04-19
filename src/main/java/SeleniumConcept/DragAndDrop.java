package SeleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop  {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Believerz\\AutomationProject\\driver\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();   // browser launch 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();   // maximizing  browser
		driver.get("https://demoqa.com/droppable");
		
		
		Actions mouseAction = new Actions(driver);
		WebElement draggingElement=driver.findElement(By.xpath("//*[@id='draggable']"));
		Thread.sleep(6000);

		WebElement droppingElement=driver.findElement(By.xpath("//*[@id='droppable']"));
		mouseAction.dragAndDrop(draggingElement, droppingElement).perform();
		
		//mouseAction.clickAndHold(draggingElement).moveToElement(droppingElement).release(droppingElement).build().perform();
		Thread.sleep(6000);
		driver.quit();
		

	}
}
