package testNG_demo;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JOB_Activity_6 {
WebDriver driver;
	
	@BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        //Open a browser
        driver.get("https://alchemy.hguy.co/jobs");  

}
	
	@Test
    public void mainTest() {
		
		//Main Test Apply for a JOB
		
		//Navigate to jobs Page
		driver.findElement(By.xpath("//li[@id='menu-item-24']")).click();
		
		//Search for a Particular Job and wait for the listing to show
		 WebElement search = driver.findElement(By.id("search_keywords"));
	     search.sendKeys("Tester");
	     driver.findElement(By.className("search_submit")).click();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     
	     // Click Open one of the Jobs listed and Apply
	     driver.findElement(By.xpath("//div[@class='position']")).click();
	     driver.findElement(By.xpath("//input[@value='Apply for job']")).click();
	     
	     // Print the email to the console
	     String email = driver.findElement(By.xpath("//div[@class='application_details']//a")).getText();
	     System.out.println("The email text is  : " + email);
	     
    }
	
	@AfterClass
    public void afterClass() {
        //Close browser
        driver.close();
    }
	
}

