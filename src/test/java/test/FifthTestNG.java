package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FifthTestNG {
  @Test(priority=1)
  public void f() {
	  
	  System.out.println("Function Print Statement");
	  Reporter.log("Code is uder function 1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod Print Statement");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod Print Statement");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass Print Statement");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass Print Statement");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest Print Statement");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest Print Statement");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite Print Statement");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite Print Statement");
  }
  
  @Test(priority=2)
  public void f2() {
	  
	  System.out.println("Function 2 Print Statement");
	  Reporter.log("Code is uder function 2");
  }

  @Test(priority=3)
  public void f3() {
	  
	  System.out.println("Function3 Print Statement");
	  Reporter.log("Code is uder function 3");
  }
}
