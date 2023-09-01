package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditClientPage {
	
private WebDriver driver;
	
	public EditClientPage() {
		
		//link the browser//
        System.setProperty("webdriver.chrome.driver", "/Users/vijaymahar/Downloads/chromedriver-mac-arm64/chromedriver");
        
        //create an object for the browser --> web driver
        driver=new ChromeDriver();
	    
	}
	
	public void navigateTo() {
		driver.get("http://localhost:4200/viewClient");
	}
	
	public void navigatesTo() {
		driver.findElement(By.name("editclient")).click();
		//driver.findElement(By.xpath("//*[@id=\"view\"]/tr[2]/td[7]/button")).click();//
		driver.get("http://localhost:4200/editClient");
	}
	
	
	public void enterClientdetails() {
		driver.findElement(By.name("id")).sendKeys("11");
		driver.findElement(By.name("name")).sendKeys("Tushar");
		driver.findElement(By.name("email")).sendKeys("tushar@gmail.com");
		driver.findElement(By.name("address")).sendKeys("Chennai");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("repeate_password")).sendKeys("12345");
		driver.findElement(By.name("updateclient")).click();
	}
	
	
	public String isclientUpdated() {
		System.out.println(driver.findElement(By.name("h1")).getText());
	return	driver.findElement(By.name("h1")).getText();
	}
	
	public void closeBrowser() {
		driver.quit();
	}
}