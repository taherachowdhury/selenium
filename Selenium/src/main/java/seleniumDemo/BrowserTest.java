package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserTest {
 

 
	//public static void main(String[] args) {

	@Test
	public void browserTest() {
		
	
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumSoft\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe" );
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
	}

}

