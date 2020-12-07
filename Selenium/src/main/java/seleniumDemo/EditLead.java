package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import testCases.ProjectSpecificWrapper;

public class EditLead {
	
	public static void main (String[] args) throws InterruptedException {
		
		
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
		
		
		//click leads link
		driver.findElementByLinkText("Leads").click();
		
		//click Find leads link
		driver.findElementByLinkText("Find Leads").click();
		
		//Enter first name
		//driver.findElementById("ext-gen248").sendKeys("Hema");
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
		
		//Click Find leads button
	
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(3000);
		
		//click on first resulting lead
		String LeadId = driver.findElementByXPath("(//a[@ href=\"/crmsfa/control/viewLead?partyId=10036\"])[5]").getText();
		System.out.println(LeadId);
		
		driver.findElementByXPath("(//a[@ href=\"/crmsfa/control/viewLead?partyId=10036\"])[5]").click();
		
		//Verify title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("View")) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Not Matched");
		}
		//Click Edit
		driver.findElementByLinkText("Edit").click();
		
		//Change the company name
		driver.findElementById("updateLeadForm_companyName").sendKeys("CTS");
		//Click Update
		driver.findElementByXPath("//input[@value='Update'] ").click();
		
		//Confirm the changed name appears
		 String changedName = driver.findElementById("viewLead_companyName_sp").getText();
		  System.out.println(changedName);	
		 
		  if(changedName.contains("tcs")) {
			  System.out.println("Name  matched"); 
			  
			  } else {
			 System.out.println("Not matched");
			 }
		  driver.close();
	
	}

} 

