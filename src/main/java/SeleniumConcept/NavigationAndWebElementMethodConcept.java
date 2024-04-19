package SeleniumConcept;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class NavigationAndWebElementMethodConcept  {
	public static void main(String[] args) throws Exception  {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Believerz\\Automation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   // browser launch 
		DataDriverFrameworkConcept obj = new DataDriverFrameworkConcept();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();   // maximizing  browser
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		/*driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
        driver.navigate().refresh();
		Thread.sleep(3000);*/
		Actions df = new Actions(driver);

		WebElement searchTextBox=driver.findElement(By.xpath("//input[@name='q']"));
		//searchTextBox.sendKeys(obj.readingValueFromExcel().get(4).get("username"));
		
		df.keyDown(searchTextBox, Keys.SHIFT).sendKeys(searchTextBox, "fgh").keyUp(Keys.SHIFT).perform();
		df.sendKeys(searchTextBox, "dfg").build().perform();
		String color=searchTextBox.getCssValue("color");
		
		System.out.println("color is "+color);
		
		String size=searchTextBox.getCssValue("font-size");
		System.out.println("size is "+size);
		
		String background=searchTextBox.getCssValue("background");
		System.out.println("background is "+background);
		
		String family=searchTextBox.getCssValue("font-family");
		System.out.println("family is "+family);
		
		Thread.sleep(3000);
		
		searchTextBox.clear();
		
		Thread.sleep(3000);
		searchTextBox.sendKeys("jansi");
		
		boolean enable=searchTextBox.isEnabled();   //to check whether edidatble or not
		System.out.println(enable);
		
		WebElement searchButton=driver.findElement(By.xpath("//*[@class='o3j99 LLD4me yr19Zb LS8OJ']"));
		
		searchButton.click();
		
		boolean display=searchButton.isDisplayed(); //to check whther displayed or not
		System.out.println(display);
		
		boolean clickable=searchButton.isSelected();  // to check whether clickable or not
		System.out.println(clickable);
		
		Thread.sleep(3000);

		WebElement search=driver.findElement(By.xpath("(//*[@class='gNO89b'])[2]"));
		String getText=search.getText();
		System.out.println(getText);
		
		Dimension sizez=search.getSize();
		System.out.println("width is "+ sizez.getWidth());
		System.out.println("height is "+ sizez.getHeight());
		
		Point location=search.getLocation();
		System.out.println("x axis "+ location.getX() + "y axix" + location.getY());
		
		String getAttribute=search.getAttribute("value");
		System.out.println(getAttribute);
		
		String getTagName=search.getTagName();
		System.out.println(getTagName);
		search.submit();
	}
}
