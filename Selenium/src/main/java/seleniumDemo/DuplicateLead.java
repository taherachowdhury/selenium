package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
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
			
			// click on email
			driver.findElementByXPath("//span[text()='Email']").click();
			// enter email number
			driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("abc@gmail.com");
			// click Find leads button
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(3000); 
			
			// Capture name of First Resulting lead
			
			 //String FirstResultingLead 
			String leadId = driver.findElementByXPath("(//a[@ href=\"/crmsfa/control/viewLead?partyId=10396\" ])[5]").getText();
			System.out.println(leadId);
			 driver.findElementByXPath("(//a[@ href=\"/crmsfa/control/viewLead?partyId=10396\" ])[5]").click();
			 
			 //Click Duplicate Lead
				driver.findElementByPartialLinkText("Duplicate Lead").click();
				// Verify the Title as 'Duplicate Lead'
				String Title = driver.getTitle();
				System.out.println(Title);
				
				if(Title.contains("Duplicate Lead")) {
					System.out.println("Title Matched");
				} else {
					System.out.println("not Matched");
	}

				// click create Lead button
					driver.findElementByXPath("//input[@value='Create Lead']").click();
					 
					//Confirm the duplicate lead name is same as captured name
						String DuplicateLeadName = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
								System.out.println( DuplicateLeadName);
				
								if (DuplicateLeadName.contains("ABC/TCSHCLTCS")) {
					System.out.println("Duplicate Lead name matched");
					} else {
					System.out.println(" Not matched");
								}

								Thread.sleep(3000);
								driver.close();
	
	}

}