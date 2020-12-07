package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeletLead {

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
	
		//click on phone
		driver.findElementByXPath("//span[text()='Phone']").click();
		//enter phone number(areaCode)
		driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("682");
		
		 driver.findElement(By.xpath("//input[@name=\"phoneNumber\"]")).sendKeys("4444444");
			
		   //click find Leads button
		  
		    driver.findElement(By.linkText("Find Leads")).click();
		    
		    String leadId= driver.findElement(By.xpath("(//a[@href=\"/crmsfa/control/viewLead?partyId=10036\"])[5]")).getText();
			System.out.println(leadId);
			
			driver.findElement(By.xpath("(//a[@href=\"/crmsfa/control/viewLead?partyId=10036\"])[5]")).click();	
		
			// click Delete  button .
		driver.findElementByXPath("//a[text()='Delete']").click();
		
		//Click Find leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		//Enter captured lead ID
		driver.findElement(By.xpath("//input[@name=\"id\"]")).sendKeys("00001");
		//Click find leads button
		driver.findElementByXPath("//button[text() ='Find Leads']").click();
		
		//Verify error msg
		 String errormsg = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		 System.out.println(errormsg);
		 
		 if(errormsg.contains("No records")){ 
			  System.out.println("ErrorMsg is matched");
			 } else {
			    System.out.println("Not matched");
			 }
		 Thread.sleep(3000); 
		 //driver.close();
		
		
		
	
		
	}
	
}	


