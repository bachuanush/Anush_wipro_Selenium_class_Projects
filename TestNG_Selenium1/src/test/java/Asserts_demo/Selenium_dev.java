package Asserts_demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Selenium_dev {
	WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();
	  driver.get("https://www.selenium.dev/");
	  driver.manage().window().maximize();
  }
  
  @Test
  public void title() {
	    String expectedtitle="Selenium";

	    String actualtitle=driver.getTitle();
	    Assert.assertEquals(actualtitle, expectedtitle, "Title Validation failed");
	    System.out.println("Expected Title:"+expectedtitle);
	    System.out.println("Actual Title:"+actualtitle);
	}
  
  @Test
  public void url() {
	    String expectedurl="https://www.selenium.dev/";

	    String actualurl=driver.getCurrentUrl();
	    Assert.assertEquals(actualurl, expectedurl, "URL Validation failed");
	    System.out.println("Expected URL:"+expectedurl);
	    System.out.println("Actual URL:"+actualurl);
	}
  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
