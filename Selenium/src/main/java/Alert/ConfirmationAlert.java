package Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException   {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lipac\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.get ("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName ("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		
		driver.findElementByXPath("//a[text()='Merge']").click();
		
		//switching to alert and capturing alert message
		
	String confirmationAlert= driver.switchTo().alert().getText();
	System.out.print(confirmationAlert);
	
	Thread.sleep(3000);
	
	driver.switchTo().alert().dismiss();
	
	
			}
	
	}
