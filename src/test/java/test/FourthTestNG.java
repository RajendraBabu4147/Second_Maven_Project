package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class FourthTestNG {
	
	 WebDriver driver;// declared here to make it access to all methods 

	  @Test
	  public void f() {
		  
	     driver.findElement(By.id("userName")).sendKeys("Rajendra Babu");
	         
	         driver.findElement(By.id("userEmail")).sendKeys("RajendraBabu@gmail.com");
	         
	         WebElement cAddress = driver.findElement(By.id("currentAddress"));
	         cAddress.sendKeys("123, Cross1 , Street2 , Bangalore");

	 
	        String currAdd = cAddress.getText();
	        
	        Actions actions = new Actions(driver);

	        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

	        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	        actions.sendKeys(Keys.TAB).build().perform();
	        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	        
	        WebElement pAddress = driver.findElement(By.id("permanentAddress"));
	        String perAdd = pAddress.getText();
	        
	        
	        assertEquals(currAdd, perAdd);
	  }
	  @BeforeTest
	  public void beforeTest() {
		  

	  	System.setProperty("webdriver.edge.driver", "C:\\ShiftGear\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
	      driver.get("https://demoqa.com/text-box");
	      driver.manage().window().maximize();
	      
	  }

	  @AfterTest
	  public void afterTest() {
		  
	      driver.quit(); // method is used to clean up hence using driver quit

	  }

	}
