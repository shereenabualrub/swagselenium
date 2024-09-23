import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameter {
	
	WebDriver driver = new ChromeDriver();
	String myWebsite = "https://www.saucedemo.com/v1/index.html";
	String userName = "standard_user";
	String password = "secret_sauce";
	
	void login() {
		WebElement userNameInput = driver.findElement(By.id("user-name"));
	WebElement passwordInput =	driver.findElement(By.id("password"));
	WebElement loginButton = driver.findElement(By.id("login-button"));
	userNameInput.sendKeys(userName);
	passwordInput.sendKeys(password);
	loginButton.click();
	}
	
	void add (String...items) {
		

		List<WebElement>addtocartbuttons = driver.findElements(By.className("btn_primary"));
		List<WebElement>prodectnames= driver.findElements(By.className("inventory_item_name"));
		for (int i = 0; i < prodectnames.size(); i++) {
		String prodectname = prodectnames.get(i).getText();
			if (containitemName(prodectname,items)) {
				addtocartbuttons.get(i).click();
			}
		}
		
	}

	private boolean containitemName(String prodectname, String... items) {
		for(String productnamee : items) {
			if (prodectname.contains(productnamee)) {
				return true;
			}
			
		}
		return false;
	}
	
	void logout() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[normalize-space()='Open Menu']")).click();
		driver.findElement(By.xpath("//a[@id='reset_sidebar_link']")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//button[normalize-space()='Open Menu']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("logout_sidebar_link")).click();
	}
}
