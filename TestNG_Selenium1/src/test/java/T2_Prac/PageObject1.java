package T2_Prac;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageObject1 {
	WebDriver driver;
	By sign = By.linkText("Sign in");
	
	By username = By.id("userid");
	By contin = By.xpath("//button[@class=\"btn btn--fluid btn--large btn--primary\"][1]");
	
	By passwo = By.id("pass");
	By sign1 = By.id("sgnBt");
	
	By AccountStng = By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/div/button");
	By AccountStngs = By.linkText("Account settings");
	
	By Addrss = By.id("account-settings-link-ADDR");
	By edt    = By.xpath("//a[@aria-label=\"Edit Registration address, email and phone number opens in new window or tab.\"]");
	By edt2   = By.id("individual_personal_info_address_edit_button");
	
	By newaddrs = By.id("addressLine1");
	By sve      = By.id("address_edit_submit_button");
	
	By ShopByCat = By.cssSelector("span[class=\"gh-categories__title\"]");
	By videoGames = By.linkText("Video Games & Consoles");
	
	public PageObject1(WebDriver driver) {
		this.driver = driver;
	}
	
	public void sigin_in() throws InterruptedException {
		driver.findElement(sign).click();
		
		//driver.findElement(username).click();
		driver.findElement(username).sendKeys("anushrao.326@gmail.com");
		
		driver.findElement(contin).click();
		
		//driver.findElement(passwo).click();
		Thread.sleep(5000);
		driver.findElement(passwo).sendKeys("9014544204a");
		
		driver.findElement(sign1).click();
	}
	
	public void chngAddrss_in() throws InterruptedException {
		Actions act1 = new Actions(driver);
		
		WebElement stngs = driver.findElement(AccountStng);
		act1.moveToElement(stngs).perform();
		Thread.sleep(3000);

		driver.findElement(AccountStngs).click();
		
		driver.findElement(Addrss).click();
		driver.findElement(edt).click();
		driver.findElement(edt2).click();
		
		driver.findElement(newaddrs).clear();
		driver.findElement(newaddrs).sendKeys("Jalandhar");
		
		driver.findElement(sve).click();
	}
	
	public void shopByCate() {
		driver.findElement(ShopByCat).click();
		driver.findElement(videoGames).click();
	}

}
