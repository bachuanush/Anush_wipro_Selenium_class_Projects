package Step_Definition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayAllCateg {
	WebDriver driver;
	Ebay_PageClass pg4;
	
@Given("Open webpage")
public void open_webpage() {
	driver = new ChromeDriver();
    
    pg4 = new Ebay_PageClass(driver);
    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    driver.get("https://www.ebay.com/");
    System.out.println("Opened EBay website successfully");
}

@When("Click on ShopByCateg and select the cate")
public void click_on_shop_by_categ_and_select_the_cate() throws InterruptedException {
	pg4.AllCatgy_in();
	Thread.sleep(2000); // pauses for 2 seconds
}

@Then("Results showed")
public void results_showed() {

}
}
