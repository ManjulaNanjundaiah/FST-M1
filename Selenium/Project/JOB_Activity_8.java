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

public class JOB_Activity_8 {
WebDriver driver;
	
	@BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        //Open a browser
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");  

}
	@Test
    public void mainTest() {
		
		//Main Test - Login to website's backend
		
		   WebElement userName = driver.findElement(By.id("user_login"));
	       WebElement password = driver.findElement(By.id("user_pass"));
	       userName.sendKeys("root");
	       password.sendKeys("pa$$w0rd");
	        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
	        
	        // verify the login person is root 
	        String loginVerify = driver.findElement(By.xpath("//span[@class='display-name']")).getText();
	        System.out.println("The login person is : " + loginVerify);
	        Assert.assertEquals("root", loginVerify);        
	    
	}
	
	@AfterClass
    public void afterClass() {
        //Close browser
        //driver.close();
    }
	
}
