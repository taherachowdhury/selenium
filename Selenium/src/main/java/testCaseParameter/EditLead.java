package testCaseParameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import testCases.ProjectSpecificWrapper;

public class EditLead extends ProjectSpecificWrapper {
	
	@Test
	public void editLead() {
		

		//click leads link
		driver.findElementByLinkText("Leads").click();
		
		//click Find leads link
		driver.findElementByLinkText("Find Leads").click();
		
		
	}

}

