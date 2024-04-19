package SeleniumConcept;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakescreenShotAndScroll {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Believerz\\Automation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   // browser launch 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize(); 
		// maximizing  browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor jf = (JavascriptExecutor)driver;
		//jf.executeScript("alert('This is an selva');");
		Thread.sleep(6000);

		/*jf.executeScript("window.open('https://www.google.com')");
	    Thread.sleep(5000);
		jf.executeScript("window.close()");*/   // it is closing first tab 

		 /*jf.executeScript("popup_window = window.open('https://www.facebook.com')");
		    Thread.sleep(5000);
		    jf.executeScript("popup_window.close()");*/     // it is closing current tab
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		String DomainName = jf.executeScript("return document.domain;").toString();
		String title = jf.executeScript("return document.title;").toString();
		String url = jf.executeScript("return document.URL;").toString();
		System.out.println("X ="+DomainName);
		System.out.println("Y ="+title);

		System.out.println("Z ="+url);

		//((JavascriptExecutor) driver).executeScript("return document.getElementById('id').selectedIndex = '" + 1 + "';"); // select drop down value using javascript executor
		
		WebElement searchTextBox=driver.findElement(By.xpath("//input[@name='q']"));
		jf.executeScript("arguments[0].setAttribute('style','background: cyan; border: solid 2px red');",searchTextBox );
		searchTextBox.sendKeys("jansi");
		//String attribute=searchTextBox.getAttribute("value");
		//String attribute = jf.executeScript("return document.getElementById('q').getAttribute('value')").toString();
		//System.out.println("ATTRIBIUTE ="+attribute);
		Thread.sleep(3000);

        WebElement searchButton=driver.findElement(By.xpath("//*[@class='gb_qa gb_0d gb_Wa gb_Ic']"));
        //jf.executeScript("arguments[0].click()",searchButton );
        searchButton.click();
		
		WebElement search=driver.findElement(By.xpath("(//*[@class='gNO89b'])[2]"));
		
		search.click();
		
		WebElement relatedSearch=driver.findElement(By.xpath("//*[@class='mfMhoc']"));
		String ty=relatedSearch.getText();
		System.out.println("GETTEXT ="+ty);
		JavascriptExecutor j = (JavascriptExecutor)driver;
	//	j.executeScript("window.scrollBy(0,500)");
		
		String date=new SimpleDateFormat("E dd-MM-yyyy hh-mm-ss aa").format(new Date());
		System.out.println(date);

		TakesScreenshot t = (TakesScreenshot)driver;
		
		File source =t.getScreenshotAs(OutputType.FILE);  // source contain taken screenshot file
		
		String location = "E:\\Selenium\\Believerz\\Automation\\ScreenShots\\"+date+".png";
		File destination = new File(location);  //this is location wer v going to save that file
		FileUtils.copyFile(source, destination);
		
		j.executeScript("arguments[0].scrollIntoView(true)",relatedSearch );
		
		Thread.sleep(3000);
		WebElement above=driver.findElement(By.xpath("//*[text()='Tools']"));
		j.executeScript("arguments[0].scrollIntoView(false)",above );
		Thread.sleep(3000);
		
		driver.quit();
	
	}
}

