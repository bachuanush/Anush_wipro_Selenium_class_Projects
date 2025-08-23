package Step_Definition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ebay_ChngAddrs {
	WebDriver driver;
	Ebay_PageClass pg5;
	
	@Given("must in the page")
	public void must_in_the_page() throws InterruptedException {
		driver = new ChromeDriver();
        
        pg5 = new Ebay_PageClass(driver);
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://www.ebay.com/");
        System.out.println("Opened EBay website successfully");
        
        driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh");
        
        pg5.email_in();
        pg5.con_in();
        pg5.pass_in();

        Thread.sleep(2000); // pauses for 2 seconds
        
        pg5.submit_in();
	}

	@When("Click on account stngs and chng addrss")
	public void click_on_account_stngs_and_chng_addrss() throws InterruptedException {
		pg5.chngeAddress();
        Thread.sleep(2000); // pauses for 2 seconds

	}

	@Then("User change the address successfully")
	public void user_change_the_address_successfully() {

	}
}
