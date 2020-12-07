package advanceUserInteraction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lipac\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/");
		
		driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement content = driver.findElementByClassName("menulink");
		
		Actions action = new Actions(driver);
		
		Thread.sleep(2000);
		
		action.moveToElement(content).perform();
		
		//driver.close();
		

	}

}
