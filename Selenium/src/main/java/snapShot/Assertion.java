package snapShot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion {
		
	public static void main (String [] args) {
	
			//driver setup
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Lipac\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://www.google.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	//get tittle
	
	String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title,"Google");
		Assert.assertEquals(title, "Google","Asserting the title");
		
		
		boolean searchBox =	driver.findElementByName("q").isDisplayed();
		System.out.println(searchBox);
		
		Assert.assertTrue(searchBox, "Verify if the search box is displayed");



}


}
