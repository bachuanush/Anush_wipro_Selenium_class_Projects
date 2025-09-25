package Testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Hotels {
	WebDriver driver;
	WebDriverWait wait;
	
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  driver=new ChromeDriver();
		driver.get("https://www.phptravels.net");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
  }

  @Test
  public void f() throws InterruptedException {
	  
//	  driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[1]/ul/li[2]/a"));
//	  Thread.sleep(5000);
	  
	  WebElement flights = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[1]/ul/li[2]/a")));
      flights.click();
  	System.out.print("hotels");
  	
  	
  	WebElement city = wait.until(ExpectedConditions.elementToBeClickable(By.className("select2-selection__rendered")));
    //city.click();
    city.sendKeys("Hyderabad");
	  city.sendKeys(Keys.ENTER);
	System.out.print("city");
	  
//	  WebElement city = driver.findElement(By.className("select2-search__field"));
//	  Thread.sleep(5000);
//	  city.sendKeys("Hyderabad");
//	  city.sendKeys(Keys.ENTER);
	  
	  Thread.sleep(5000);
	  driver.findElement(By.className("checkin")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div[1]/table/tbody/tr[4]/td[6]")).click();
	  
	  Thread.sleep(5000);
	  driver.findElement(By.id("checkout")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[5]/div[1]/table/tbody/tr[5]/td[3]")).click();
	  
	  Thread.sleep(5000);
	  driver.findElement(By.className("c8LPF-icon"));
	  
	  
  }
  
  @AfterTest
  public void afterTest() {
  }

}
