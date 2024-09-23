import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class ClassTwo extends Parameter {

	
	
	@BeforeTest
	public void setup() {
		driver.get(myWebsite);
		
		driver.manage().window().maximize();
		
	}
	
	
	@Test()
	public void pub() throws InterruptedException {
	
	login();
	Thread.sleep(2000);
	add("Backpack","T-Shirt (Red)","Fleece Jacket");
	
	logout();
	}
	
	@Test()
	public void pubb() throws InterruptedException {
	
	login();
	
	add("Bike Light","T-Shirt (Red)");
	
	Thread.sleep(3000);
	logout();
	}
	
	
	@AfterTest
	private void pu() {
		

	}
}

