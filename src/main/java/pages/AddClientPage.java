package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddClientPage {
	
private WebDriver driver;
	
	public AddClientPage() {
		
		//link the browser//
        System.setProperty("webdriver.chrome.driver", "/Users/vijaymahar/Downloads/chromedriver-mac-arm64/chromedriver");
        
        //create an object for the browser --> web driver
        driver=new ChromeDriver();
	    
	}
	
	public void navigateTo() {
		driver.get("http://localhost:4200/addClient");
	}
	
	
	public void enterClientdetails() {
		driver.findElement(By.name("id")).sendKeys("10");
		driver.findElement(By.name("name")).sendKeys("Tushar");
		driver.findElement(By.name("email")).sendKeys("tushar@gmail.com");
		driver.findElement(By.name("address")).sendKeys("Chennai");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("repeate_password")).sendKeys("12345");
		driver.findElement(By.name("addclient")).click();
	}
	
	
	public String isclientAdded() {
		System.out.println(driver.findElement(By.name("h1")).getText());
	return	driver.findElement(By.name("h1")).getText();
	}
	
	public void closeBrowser() {
		driver.quit();
	}
}


