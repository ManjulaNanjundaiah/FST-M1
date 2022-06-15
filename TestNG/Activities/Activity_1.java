package testNG_demo;

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


public class Activity_1 {
	
	    WebDriver driver;

	    @BeforeMethod
	    public void beforeMethod() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	        
	        //Open browser
	        driver.get("https://www.training-support.net");
	    }

	    @Test
	    public void exampleTestCase() {
	        // Check the title of the page
	        String title = driver.getTitle();
	            
	        //Print the title of the page
	        System.out.println("Page title is: " + title);
	            
	            //Assertion for page title
	        Assert.assertEquals("Training Support", title);
	                    
	        //Find the clickable link on the page and click it
	        driver.findElement(By.id("about-link")).click();
	        
	        //Print title of new page
	        System.out.println("New page title is: " + driver.getTitle());
	        
	        Assert.assertEquals(driver.getTitle(), "About Training Support");
	    }
	        
	    @AfterClass
	    public void tearDown() {
	        Reporter.log("Ending Test |");
	        //Close the driver
	        driver.close();
	    }
	}

