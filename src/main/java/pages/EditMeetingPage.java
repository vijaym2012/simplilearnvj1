package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditMeetingPage {
	
private WebDriver driver;
	
	public EditMeetingPage() {
		
		//link the browser//
        System.setProperty("webdriver.chrome.driver", "/Users/vijaymahar/Downloads/chromedriver-mac-arm64/chromedriver");
        
        //create an object for the browser --> web driver
        driver=new ChromeDriver();
	    
	}
	
	public void navigateTo() {
		driver.get("http://localhost:4200/viewMeet");
	}
	
	public void navigatesTo() {
		driver.findElement(By.name("editmeeting")).click();
		//driver.findElement(By.xpath("//*[@id=\"view\"]/tr[2]/td[6]/button")).click();//
		driver.get("http://localhost:4200/editMeet");
	}
	
	
	public void enterMeetingdetails() {
		driver.findElement(By.name("mid")).sendKeys("1");
		driver.findElement(By.name("meettopic")).sendKeys("NewLeadership");
		driver.findElement(By.name("personnumber")).sendKeys("10");
		driver.findElement(By.name("meetdate")).sendKeys("19-08-2023");
		driver.findElement(By.name("meettime")).sendKeys("12:10");
		driver.findElement(By.name("updatemeet")).click();
	}
	
	
	public String ismeetingUpdated() {
		System.out.println(driver.findElement(By.name("h1")).getText());
	return	driver.findElement(By.name("h1")).getText();
	}
	
	public void closeBrowser() {
		driver.quit();
	}
}
