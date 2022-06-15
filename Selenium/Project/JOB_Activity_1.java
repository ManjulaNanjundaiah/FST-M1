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

public class JOB_Activity_1 {
	WebDriver driver;
	
	@BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        //Open a browser
        driver.get("https://alchemy.hguy.co/jobs");   
    }

	@Test
    public void mainTest() {
		//get the Title of the website and verify
		String title = driver.getTitle();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Page title is: " + title);
		Assert.assertEquals("Alchemy Jobs - Job Board Application", title);
        
    }
	
	@AfterClass
    public void afterClass() {
        //Close browser
        driver.close();
    }
	
}
