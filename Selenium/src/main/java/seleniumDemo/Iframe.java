package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lipac\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	
	
	//Frame locator
	//driver.switchTo().frame("iframeResult");
	//driver.switchTo().frame(1);
	driver.switchTo().frame(driver.findElementByXPath("//iframe[@allowfullscreen='true']"));
	
	//First name
	driver.findElementByXPath("//input[@value='John']").clear();
	driver.findElementByXPath("//input[@value='John']").sendKeys("Lipa");
	
	//Last name
	driver.findElementByXPath("//input[@value='Doe']").clear();
	driver.findElementByXPath("//input[@value='Doe']").sendKeys("chy");
	
	//submit
	driver.findElementByXPath("//input[@type='submit']").click();
	//driver.close();
	
	
	
	
	
	
	
	
	/*driver.findElementByXPath("//input[@value='John']").clear();
	//driver.findElementByXPath("//input[@value='John']").sendKeys("Lipa");
	
	driver.findElementByXPath("//input[@id='lname']").clear();
	driver.findElementByXPath("//input[@id='lname']").sendKeys("Chy");
	
	driver.switchTo().parentFrame();*/
	
	
	
			
	
	
	
	
	
		
		
			


	
	
	
	
	
	}

}
