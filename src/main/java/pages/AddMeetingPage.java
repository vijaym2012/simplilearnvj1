package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddMeetingPage {
	
private WebDriver driver;
	
	public AddMeetingPage() {
		
		//link the browser//
        System.setProperty("webdriver.chrome.driver", "/Users/vijaymahar/Downloads/chromedriver-mac-arm64/chromedriver");
        
        //create an object for the browser --> web driver
        driver=new ChromeDriver();
	    
	}
	
	public void navigateTo() {
		driver.get("http://localhost:4200/addMeet");
	}
	
	
	public void enterMeetingdetails() {
		driver.findElement(By.name("mid")).sendKeys("1");
		driver.findElement(By.name("meettopic")).sendKeys("NewLeadership");
		driver.findElement(By.name("personnumber")).sendKeys("10");
		driver.findElement(By.name("meetdate")).sendKeys("19-08-2023");
		driver.findElement(By.name("meettime")).sendKeys("12:10");
		driver.findElement(By.name("addmeet")).click();
	}
	
	
	public String isMeetingAdded() {
		System.out.println(driver.findElement(By.name("h1")).getText());
	return	driver.findElement(By.name("h1")).getText();
	}
	
	public void closeBrowser() {
		driver.quit();
	}
}
