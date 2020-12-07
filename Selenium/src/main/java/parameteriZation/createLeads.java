package parameteriZation;

import org.testng.annotations.Test;

public class createLeads extends ProjectSpecificWrapper {

	@Test(dataProvider = "getData")
	
	public void createLead(String cName, String fName, String lName)  {
		
		//click leads link
		driver.findElementByLinkText("Leads").click();
	
		//click create lead
	
		driver.findElementByLinkText("Create Lead").click();
   
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	  //enter firstname
	
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys(fName);
	 
	//enter lastName
	
		driver.findElementByXPath("(//input[@name='lastName'] ) [3]").sendKeys (lName);
	
	
		

	}

}