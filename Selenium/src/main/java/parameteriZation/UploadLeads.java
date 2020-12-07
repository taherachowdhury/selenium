package parameteriZation;

import org.testng.annotations.Test;

public class UploadLeads extends ProjectSpecificWrapper {

	@Test
	public void uploadLeads () {

		//click leads link
		driver.findElementByLinkText("Leads").click();
		
		//click UploadLeads ink
		driver.findElementByLinkText("Upload Leads").click();
		

	}
	
}


	
