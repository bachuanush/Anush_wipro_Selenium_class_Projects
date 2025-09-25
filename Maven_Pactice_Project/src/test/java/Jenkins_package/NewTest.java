package Jenkins_package;

import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class NewTest {
	WebDriver driver;
	  @Test
	  public void f() {

		  WebDriverManager.chromedriver().setup();
		  
		    driver=new ChromeDriver();
			driver.get("http://zero.webappsecurity.com/login.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
