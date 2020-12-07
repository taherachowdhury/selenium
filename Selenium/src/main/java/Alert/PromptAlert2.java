package Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lipac\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		System.out.println(driver.getTitle());
						
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		driver.findElementByXPath("//button[text()='Click for JS Prompt']").click();
		
		
		Alert promptAlert = driver.switchTo().alert();
		
		Thread.sleep(3000);
		promptAlert.getText();
		promptAlert.sendKeys("I am Lipa");promptAlert.accept();
		
		
		System.out.println(driver.findElement(By.id("result")).getText());
	
	}

}
