package snapShot;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lipac\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
			
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		//click on login button
		
		driver.findElementByClassName("decorativeSubmit").click();
		//click CRM/SFA
		
		driver.findElementByLinkText("CRM/SFA").click();
		//click create lead
		
		driver.findElementByLinkText("Create Lead").click();
		//fing all link
		List<WebElement> linklist = driver.findElementsByTagName("a");
		System.out.println(linklist.size());
	
		//find all div tag
		List<WebElement> alldivTag = driver.findElementsByTagName("div");
		System.out.println(alldivTag. size());
	
		//find all inputTag
		List<WebElement> allinputTag = driver.findElementsByTagName("input");
		System.out.println( allinputTag.size());
	
		List<WebElement> allscriptTag = driver.findElementsByTagName("script");
		System.out.println(allscriptTag.size());
	
	}

}
