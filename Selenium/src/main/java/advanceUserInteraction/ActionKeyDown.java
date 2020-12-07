package advanceUserInteraction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionKeyDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lipac\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		 
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		WebElement Item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement Item2 = driver.findElementByXPath("//li[text()='Item 2']");
		WebElement Item4 = driver.findElementByXPath("//li[text()='Item 4']");
		
		Actions action = new Actions (driver);
		action.keyDown(Keys.CONTROL).click(Item1).click(Item2).click(Item4).release().perform();
		
		//driver.close();
		
		
		 }

}
