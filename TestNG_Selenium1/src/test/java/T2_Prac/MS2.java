package T2_Prac;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;


public class MS2 {
	WebDriver driver;
	PageObject1 pg;
	
	@BeforeTest
	public void before() throws InterruptedException {
		driver = new ChromeDriver();
		pg = new PageObject1(driver);
		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
	}
	
	 @Test(priority = 1)
	  public void signin() throws InterruptedException {
		  pg.sigin_in();;
		  Thread.sleep(5000);
	  }
	 
	 @Test(priority = 2)
	  public void newAddr() throws InterruptedException {
		  pg.chngAddrss_in();
		  Thread.sleep(5000);
	  }
	
//  @Test
//  public void f() throws InterruptedException {
//	  pg.shopByCate();
//	  Thread.sleep(5000);
//  }


 
}
