package SeleniumConcept;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadConcept {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Believerz\\AutomationProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   // browser launch 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();   // maximizing  browser
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		Thread.sleep(4000);
		
		WebElement ss=driver.findElement(By.xpath("//*[text()='Select WORD files']"));
		ss.click();
		
		String path = "C:\\Users\\selva\\Desktop\\HCl Induction.Docx";
		Robot robo = new Robot();
		ClipboardOwner owner = null;
		robo.setAutoDelay(3000);
		StringSelection select = new StringSelection(path);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, owner);
		robo.keyPress(KeyEvent.VK_CONTROL);

		robo.keyPress(KeyEvent.VK_V);
		robo.setAutoDelay(3000);
		
		robo.keyRelease(KeyEvent.VK_CONTROL);

		robo.keyRelease(KeyEvent.VK_V);
		robo.setAutoDelay(3000);

		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
	}
}
