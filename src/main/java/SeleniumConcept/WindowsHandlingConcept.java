package SeleniumConcept;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingConcept {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Believerz\\AutomationProject\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();   // browser launch 
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();   // maximizing  browser
			driver.get("http://demo.automationtesting.in/Windows.html");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text() ='    click   ']")).click();
			
			String parentTab=driver.getWindowHandle();  // parent tab id
			System.out.println(parentTab);
			
			
			Set<String> allTabs=driver.getWindowHandles();
			
			List<String> alltabb = new ArrayList<String>();
			
			alltabb.addAll(allTabs);
			Thread.sleep(5000);

			driver.switchTo().window(alltabb.get(1));
			Thread.sleep(5000);
             
			WebElement efe = driver.findElement(By.xpath("(//*[text()='Downloads'])[1]"));
			String gettext=efe.getText();
			if(gettext.equals("Downloads")) {
	         driver.findElement(By.xpath("(//*[text()='Downloads'])[1]")).click();
			}
			else {
				driver.quit();
			}
			Thread.sleep(5000);
					driver.close();
					Thread.sleep(4000);
					driver.switchTo().window(alltabb.get(0));

				//driver.switchTo().defaultContent();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//*[text() ='    click   ']")).click();
				Thread.sleep(4000);
			//	driver.switchTo().window(alltabb.get(1));
				driver.close();
			}
		//	
	}

