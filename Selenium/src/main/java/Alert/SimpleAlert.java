package Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lipac\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");	
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	
	driver.findElementByXPath("(//input[@id='searchBtn'])[1] ").click();
	
	String simpleAlert = driver.switchTo().alert().getText();
	System.out.print(simpleAlert);
	driver.switchTo().alert().accept();
	driver.close();
	
	
	}
	

}
