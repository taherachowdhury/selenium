package snapShot;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeSnapShot {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Lipac\\eclipse-workspace\\Selenium\\drivers\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
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
	   
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		  //enter firstname
		
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Hema");

	
	
	}

}
