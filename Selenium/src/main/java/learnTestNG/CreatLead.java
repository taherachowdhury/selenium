package learnTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import testCases.ProjectSpecificWrapper;

public class CreatLead extends ProjectSpecificWrapper {


	
	@Test
	public void createLead() {
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\Lipac\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
			
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		//click on login button
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		 
		//click CRM/SFA
		
		driver.findElementByLinkText("CRM/SFA").click();*/
		
		
		// click leads
		driver.findElementByLinkText("Leads").click();
				
		// click create lead link

		driver.findElementByLinkText("Create Lead").click();
	   
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		  //enter firstname
		
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Hema");
		 
		//enter lastName
		
		driver.findElementByXPath("(//input[@name='lastName'] ) [3]").sendKeys ("Ma");
		
		//annual revenue
		driver.findElementByXPath ("//input[@id='createLeadForm_annualRevenue']").sendKeys ("100");
		
		  //enter Description
		driver.findElementByXPath ("//textarea[@name='description'] ").sendKeys ("TCS");
		
		driver.findElementByXPath ("//textarea[@name='importantNote']").sendKeys("importantNote");
		
		
		driver.findElementByXPath ("//input[@id='createLeadForm_primaryEmail']").sendKeys ("abc@gmail.com");  
		
		driver.findElementById ("createLeadForm_primaryWebUrl").sendKeys ("google.com");
		
		driver.findElementByXPath ("//input[@id='createLeadForm_generalProfTitle']").sendKeys("Ms");
		
		driver.findElementById ("createLeadForm_departmentName").sendKeys ("MKT");
		
		driver.findElementByXPath ("//input[@name='generalPostalCode']").sendKeys ("75061");
		
		
		driver.findElementById ("createLeadForm_primaryPhoneNumber"). sendKeys("123456");
		
		
		driver.findElementByXPath("//input[@name='numberEmployees']").sendKeys ("100");
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select (source);
		dd.selectByVisibleText ("Conference");
		
		
		WebElement mktcam=driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd1 = new Select (mktcam);
		dd1.selectByValue("CATRQ_AUTOMOBILE");
		
		//choose Industry
		WebElement ind= driver.findElementById ("createLeadForm_industryEnumId");
		Select dd2 = new Select (ind);
		dd2.selectByValue ("IND_INSURANCE");
		
		//choose Ownership
		WebElement  Ownership= driver.findElementByXPath ("//select [@name='ownershipEnumId']");
		Select dd3 =new Select ( Ownership);
		dd3.selectByIndex(3); 
		
		WebElement stpo =driver.findElementByXPath("//select[@id='createLeadForm_generalStateProvinceGeoId'] ");
		Select dd4 = new Select (stpo);
		dd4.selectByVisibleText("Arizona");
				
		//driver.close();
		
		
		}

}

