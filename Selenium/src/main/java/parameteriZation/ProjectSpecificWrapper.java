package parameteriZation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

	public class ProjectSpecificWrapper  {

	public ChromeDriver driver;
	
	@Parameters ({"url","uname","pwd"}) 
	@BeforeMethod
	public void login (String url,String uname, String pwd) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lipac\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys(uname);
		
		driver.findElementById("password").sendKeys(pwd);
		
		//click on login button
		
		driver.findElementByClassName("decorativeSubmit").click();
				 
		//click CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
 @AfterMethod
 public void closeBrowser(){
		 driver.close();
		}
	
 @DataProvider
 public String [][] getData(){
	
	 String [][] data = new String [2][3]; 
	data[0][0] = "CAN";
	data[0][1] = "Kanon";
	data[0][2] = "Chy";
	
	data[1][0] = "ABC";
	data[1][1]= "Tamim";
	data[1][2]="Quer";

	return data;
 }


}






