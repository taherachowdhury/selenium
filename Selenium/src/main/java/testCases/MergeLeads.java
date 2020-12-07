package testCases;

import org.testng.annotations.Test;

public class MergeLeads extends ProjectSpecificWrapper {

	@Test
	public void mergeLeads () {
		
		//click leads link
				driver.findElementByLinkText("Leads").click();
				
				////click Merge  leads link
				driver.findElementByLinkText("Merge Leads").click();
			
				

	}

}
