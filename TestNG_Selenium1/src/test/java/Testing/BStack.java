package Testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class BStack {
	WebDriver driver;

  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  driver = new ChromeDriver();
      driver.manage().window().maximize();
      
      //Thread.sleep(5000);
      //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
      driver.get("https://bstackdemo.com");
      Thread.sleep(5000);
  }
  
  @Test
  public void f() throws InterruptedException {
//	  WebElement wb = driver.findElement(By.cssSelector("input[placeholder=\"Search\"]"));
//	  wb.sendKeys("Watches");
//	  
//	 driver.findElement(By.cssSelector("button[class=\"px-4 py-1 bg-gray-100 border border-l-0 border-gray-300\"]")).click();
//	 
	 Thread.sleep(2000);
 	WebElement lowtohigh = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/div[2]/div[1]/div[1]/select"));
 	Select sel=new Select(lowtohigh);
 	sel.selectByValue("lowestprice");
  }

  @AfterClass
  public void afterClass() {
  }

}
