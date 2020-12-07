package seleniumDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lipac\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		 
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		 driver.findElementByPartialLinkText("Try it Yourself »").click(); 
		 
		 String currentWindow = driver.getWindowHandle();
		
		 //System.out.println(currentWindow);
		 
		Set<String> allwind = driver.getWindowHandles(); 
		 
		//System.out.println(allwind);
		 
		
		for (String eachwin : allwind) {
			System.out.println(eachwin);
			
			driver.switchTo().window(eachwin);
			System.out.println(driver.getTitle());
			
		}
		
		
		 
		 
	
	
	}

}
