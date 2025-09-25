package T2_Prac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Yaksha {
	WebDriver driver;
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.get("https://healthapp.yaksha.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
   }
  
  @Test
  public void f() {
	  driver.findElement(By.id("username_id")).sendKeys("admin");
	  driver.findElement(By.id("password")).sendKeys("pass123");
	  
	  driver.findElement(By.id("login")).click();;
  }

  @AfterClass
  public void afterClass() {
  }

}
