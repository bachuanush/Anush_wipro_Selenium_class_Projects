package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CrossBrowser_Testing {
  WebDriver driver;
  @Test
  public void Firefox() throws InterruptedException

  {

	  driver = new FirefoxDriver();
	  driver.get("https://www.flipkart.com/"); 

	  String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

	  String actualtitle=driver.getTitle();

	  Assert.assertEquals(actualtitle, expectedtitle,"Title validation fail");

	  Thread.sleep(2000);
	  


  }
  
  @Test
  public void Chrome() throws InterruptedException

  {

	  driver = new ChromeDriver();

	  driver.get("https://www.flipkart.com/"); 

	  String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

	  String actualtitle=driver.getTitle();

	  Assert.assertEquals(actualtitle, expectedtitle,"Title validation fail");

	  Thread.sleep(2000);
	  


  }
  
  @Test
  public void flipkart() throws InterruptedException

  {

	  
	  System.setProperty("webdriver.edge.driver", "D:\\Selenium_jar\\edgedriver_win64 (1)\\msedgedriver.exe");
	  driver = new EdgeDriver();

	  driver.get("https://www.flipkart.com/"); 
	  driver.manage().window().maximize();
	  String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

	  String actualtitle=driver.getTitle();

	  Assert.assertEquals(actualtitle, expectedtitle,"Title validation fail");

	  Thread.sleep(2000);
  }
  
  
  @AfterMethod
  public void afterTest()
  {
	  driver.quit();
  }
}
