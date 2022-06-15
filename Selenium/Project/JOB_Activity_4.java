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

public class JOB_Activity_4 {
WebDriver driver;
	
	@BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        //Open a browser
        driver.get("https://alchemy.hguy.co/jobs");  
}
	
	@Test
    public void mainTest() {
		
		//Get the second heading on the Page and verify
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String secondHeader = driver.findElement(By.xpath("//h2")).getText();
        System.out.println("The Second header is : " + secondHeader);
        Assert.assertEquals("Quia quis non", secondHeader);
    }
	
	@AfterClass
    public void afterClass() {
        //Close browser
        driver.close();
    }
	
}
	
