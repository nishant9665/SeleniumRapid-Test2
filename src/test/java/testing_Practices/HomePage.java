package testing_Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ".//All-Exe//chromedriver.exe");  
		driver=new ChromeDriver();  	      
	   // Launch web site  
	}
	
	 @Test(description="Open The testing page-HomePage",priority=1)  
	 public void WebLoginPersonalLoan() throws Exception  
	 {  	      
		   // Launch web site  
		    driver.navigate().to("https://automationteststore.com/");
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//a[normalize-space()='Login or register']")).click();
		    Thread.sleep(1000);
		    System.out.println("done");
		    driver.close();
	 }  
	 @Test(description="Open the google Page-HomePage", priority=2)  
	 public void MobileLoginPersonalLoan()  
	 {  
		    driver.navigate().to("https://www.google.co.in/");
	     System.out.println("Mobile Login Personal Loan");  
	 }  
	 
	 @AfterMethod
	 public void tearDown() {
		 driver.quit();
	 }

}
