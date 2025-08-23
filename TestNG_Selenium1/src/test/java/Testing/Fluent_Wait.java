package Testing;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class Fluent_Wait {
	WebDriver driver;
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://zero.webappsecurity.com/login.html");
	  
	  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	         .withTimeout(Duration.ofSeconds(10))
	         .pollingEvery(Duration.ofSeconds(2))
	         .ignoring(NoSuchElementException.class);
	  
	    
	    WebElement user = wait.until(new Function<WebDriver, WebElement>() {
		    public WebElement apply(WebDriver driver) {
		    return driver.findElement(By.id("user_login"));
		    
	    }
	  });
  }
}
