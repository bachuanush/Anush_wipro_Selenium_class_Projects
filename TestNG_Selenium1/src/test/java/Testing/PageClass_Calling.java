package Testing;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PageClass_Calling {
	WebDriver driver;
	PageClass pg;
	 @BeforeClass
	    public void setUp() {
	        // 2. Initialize the instance variables here
	        driver = new ChromeDriver();
	               
            pg = new PageClass(driver);
	        
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        driver.get("https://www.ebay.com/");
	        System.out.println("Opened EBay website successfully");
	    }

	    @Test(priority = 1)
	    public void testlogin() throws InterruptedException {
	        driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh");

	        pg.email_in();
	        pg.con_in();
	        pg.pass_in();
	        pg.submit_in();
	        Thread.sleep(2000); // pauses for 2 seconds

	    }

	    								// 2. searches
	    @Test(priority = 2)
	    public void Search() throws InterruptedException {
	        pg.search_in();
	        Thread.sleep(2000); // pauses for 2 seconds

	    }
	    
	    @Test (priority = 3) //2
	    public void multipleSearchTest() throws InterruptedException  {
	    	pg.searchMul_in();
	    	Thread.sleep(2000); // pauses for 2 seconds

	    }
	    
	    @Test (priority = 4) //3
	    public void addToCartTest() throws InterruptedException {	
	        pg.addCart_in();
	        Thread.sleep(2000); // pauses for 2 seconds

	        
	    }
	    

	    @Test(priority = 5)  //6
	    public void deleteFromCartTest() throws InterruptedException {
	    	pg.deleteCart_in();
	    	Thread.sleep(2000); // pauses for 2 seconds

	    }	 
	    
	    @Test(priority = 6)  //6
	    public void chngeAddress() throws InterruptedException {
	    	pg.ChngAddrs_in();
	    	Thread.sleep(2000); // pauses for 2 seconds
//
	  }
	   
	    
	    
		@Test (priority = 7)     //7
		  public void ShopByCatgy() throws InterruptedException {
			pg.ShopByCatgy_in();
			Thread.sleep(2000); // pauses for 2 seconds

		}
		

}
