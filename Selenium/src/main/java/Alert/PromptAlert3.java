package Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lipac\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.switchTo().frame("iframeResult");
		
			driver.findElementByXPath("//button[text()='Try it']").click();
		
		//switch to alert
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(2000);
		alert.getText();
		//alert.sendKeys
		alert.sendKeys("My name is Lipa");alert.accept();
	
		//print the message
		System.out.println(driver.findElementById("demo").getText());
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		
		
		
		
	}

}
