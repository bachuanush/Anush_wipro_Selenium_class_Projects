package Tira_Mini_Proj;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class Test_Cart {
	WebDriver driver;
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	driver=new ChromeDriver();
	driver.get("https://www.tirabeauty.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

  }
  
  @Test(priority = 1)
  public void login() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div[3]/div[2]/div/a/div/img")).click();
      Thread.sleep(2000);
      
      driver.findElement(By.name("mobile-number")).click();
      Thread.sleep(2000);
      
      driver.findElement(By.name("mobile-number")).sendKeys("9014544204");
      Thread.sleep(2000);
      
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div/div[2]/div[2]/div[3]/div/div/div/div[1]/div/div[2]/div/img")).click();
      
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div/div[2]/div[2]/div[3]/div/div/div/div[2]/button")).click();
      Thread.sleep(2000);
      
      // Explicit wait for OTP field
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div/div[2]/div[2]/div[3]/div/div/div/div[1]/div[2]/div[1]/div/div/div[1]/input")));
      
   //Wait for Verify button to become clickable AFTER OTP entry
      wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div/div[2]/div[2]/div[3]/div/div/div/div[2]/div/button")
      ));
      
      driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div/div[2]/div[2]/div[3]/div/div/div/div[2]/div/button")).click();
      Thread.sleep(2000);
  }
  
  @Test(priority = 2)
  public void cart() throws InterruptedException {
	  driver.findElement(By.id("search")).click();
	  driver.findElement(By.id("search")).sendKeys("Face wash");
	  driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
  
	  driver.navigate().to("https://www.tirabeauty.com/product/skin1004-madagascar-centella-poremizing-deep-cleansing-foam-125ml-7591094");
	  
	  // add product to cart
	  driver.findElement(By.cssSelector("button[class=\"custom-btn primary lg no-tap-highlight\"]")).click();
  
	  driver.findElement(By.id("search")).click();
	  driver.findElement(By.id("search")).sendKeys("soaps");
	  driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
  
	  driver.navigate().to("https://www.tirabeauty.com/product/fixderma-kojic-acid-soap-epifager-soap-skin-brightening-skin-lightening-soap-75-g-7614615");

	  //add product to cart
	  driver.findElement(By.cssSelector("button[class=\"custom-btn primary lg no-tap-highlight\"]")).click();

	  
	  driver.findElement(By.cssSelector("div[class=\"cart-count\"]")).click();

	  //to remove the added product
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div/div/div/div[1]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[2]/div/div/div/div[1]/div/div/button[1]/img")).click();
	  Thread.sleep(2000);
	  
	  //to remove the added product
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div/div[2]/div[2]/div[2]/div/div/div/div[3]/div/div/button[1]")).click();
      Thread.sleep(2000);
	  
      //Increase the product qty
	  By addButton = By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/div/div/div/div[1]/div/div/button[2]/img");
	  for (int i = 0; i < 6; i++) {
		    driver.findElement(addButton).click();
		    Thread.sleep(1000); // optional: wait 1 sec between clicks
		}
  }

}
