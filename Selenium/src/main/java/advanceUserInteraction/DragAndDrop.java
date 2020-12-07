package advanceUserInteraction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lipac\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver ();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElementById("draggable");
		WebElement drop = driver.findElementById("droppable");
		Actions action = new Actions (driver);
		
		Thread.sleep(3000);
		//action.dragAndDrop(drag, drop).perform();
		action.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
		
		driver.switchTo().defaultContent();
		

	}

}
