package testCases;

import org.testng.annotations.Test;

public class RequestCatalog extends ProjectSpecificWrapper {

	@Test
	
	public void requestCatalog () {

		//click leads link
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Request Catalog").click();
		
	
	
	}
}
