package Step_Definition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ebay_ChngLang {
	WebDriver driver;
	Ebay_PageClass pg6;
	
	@Given("page open")
	public void page_open() {
		driver = new ChromeDriver();
        
        pg6 = new Ebay_PageClass(driver);
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://www.ebay.com/");
        System.out.println("Opened EBay website successfully");
	}


	@When("go to chng the lang")
	public void go_to_chng_the_lang() throws InterruptedException {
		pg6.languageChange();
        Thread.sleep(2000); // pauses for 2 seconds
	}

	@Then("lang chnaged")
	public void lang_chnaged() {
		driver.quit();
	}



}
