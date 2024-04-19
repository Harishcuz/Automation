package SeleniumConcept;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrokenLinks {
	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Believerz\\Automation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   // browser launch 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();   // maximizing  browser
		driver.get("https://www.amazon.in/");
		List<WebElement> totalLinks=driver.findElements(By.tagName("a"));
		List<WebElement> totalImg=driver.findElements(By.tagName("img"));
		totalLinks.addAll(totalImg);
		//System.out.println(totalLinks.size());
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		for(int j =0;j<totalLinks.size();j++) {
		//	System.out.println(totalLinks.get(j).getAttribute("href"));
			if(totalLinks.get(j).getAttribute("href") != null && (!totalLinks.get(j).getAttribute("href").contains("javascript")) ) {
				activeLinks.add(totalLinks.get(j));
			}
		}
		//System.out.println("ActiveLink ="+activeLinks.size());
		for(int p=0;p<activeLinks.size();p++) {
			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(p).getAttribute("href")).openConnection();
			connection.connect();
			String response=connection.getResponseMessage();
			connection.disconnect();
			//if(response.equals("Service Unavailable")) {
			System.out.println(activeLinks.get(p).getAttribute("href")+"==========>"+ response);
		//	}
		}
		driver.quit();
		// 200 OK proper response Service Unavailable Forbidden
		//404 not found
		//500 internal error
		//400 bad request
	}
}
