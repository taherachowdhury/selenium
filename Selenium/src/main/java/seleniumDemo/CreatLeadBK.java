package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatLeadBK {

	public static void main(String[] args) {
		
		//launch chrome browser
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lipac\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
			
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//driver.findElement( By.id("username")).sendKeys("DemoSalesManager");
		
		//driver.findElement(By .id("password")).sendKeys("crmsfa");
		//driver.findElement(By .id("password")).sendKeys("crmsfa");
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
		//enter lastName
		
				driver.findElementByXPath("(//input[@name='lastName'] ) [3]").sendKeys ("Ma");
				
				//annual revenue
				driver.findElementByXPath ("//input[@id='createLeadForm_annualRevenue']").sendKeys ("100");
				
				  //enter Description
				driver.findElementByXPath ("//textarea[@name='description'] ").sendKeys ("TCS");
				
				driver.findElementByXPath ("//textarea[@name='importantNote']").sendKeys("importantNote");
				
				//driver.findElementByXPath ("//textarea[@id='createLeadForm_description']").sendKeys ("importantNote");
				
				driver.findElementByXPath ("//input[@id='createLeadForm_primaryEmail']").sendKeys ("abc@gmail.com");   
				
				driver.findElementById ("createLeadForm_primaryWebUrl").sendKeys ("google.com");
				
				driver.findElementByXPath ("//input[@id='createLeadForm_generalProfTitle']").sendKeys("Ms");
				
				driver.findElementById ("createLeadForm_departmentName").sendKeys ("MKT");
				
				driver.findElementByXPath ("//input[@name='generalPostalCode']").sendKeys ("75061");
				driver.findElementById ("createLeadForm_primaryPhoneNumber"). sendKeys("123456");
				
				
				driver.findElementByName("//input[@name='numberEmployees']").sendKeys ("100");
				
				WebElement source = driver.findElementById ("createLeadForm_firstNameLocal");
				Select dd = new Select (source);
				dd.selectByValue ("LEAD_WORDOFMOUTH");
				
				//selct mktCam
				WebElement mktcam= driver.findElementByXPath("//select [@id='createLeadForm_marketingCampaignId]");
				Select dd1 = new Select (mktcam);
				dd1.selectByVisibleText("Automobile");
				
				//choose Industry
				WebElement ind= driver.findElementById ("createLeadForm_industryEnumId");
				Select dd2 = new Select (ind);
				dd2.selectByValue ("IND_INSURANCE");
				
				//choose Ownership
				WebElement  Ownership= driver.findElementByXPath ("//select [@name='ownershipEnumId']");
				Select dd3 =new Select ( Ownership);
				dd3.selectByIndex(3); 
				
				
				
				
				
				
				
				
				 
				
				
				
				
				
	
	}

}
