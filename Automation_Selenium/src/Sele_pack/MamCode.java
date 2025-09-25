//package Sele_pack;
//
//public class MamCode {
//
//}
//
//
//package testng_practice;
//
//import java.time.Duration;
// 
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
// 
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
// 
//public class Phptravel {
//	WebDriver driver;
//	WebDriverWait wait;
//	@Test
//	
//	public void test() {
//		driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.get("https://www.phptravels.net/");
//		
//	     WebElement visa = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[1]/ul/li[5]/a"));
//	     visa.click();
//	  	 System.out.print("Visa page opened successfully");
//		
//    Actions act1 = new Actions(driver);
//		
//		WebElement fromCountry = driver.findElement(By.xpath("//*[@id=\"select2--container\"]"));
//		act1.moveToElement(fromCountry).perform();
//		act1.click(fromCountry).perform();
//				
//		WebElement cntryFrom = driver.findElement(By.xpath("//*[@id=\"fadein\"]/span/span/span[1]/input"));
//		//cntryFrom.click();
//		
//		cntryFrom.sendKeys("Australia");
//		cntryFrom.sendKeys(Keys.ENTER);
//				
////        Actions act2 = new Actions(driver);
////		WebElement toCountry = driver.findElement(By.xpath("//*[@id=\"select2--container\"]"));
////		act2.moveToElement(toCountry).perform();
////		act2.click(toCountry).perform();
////		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//				
//		WebElement cntryTo = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
//		cntryTo.click();
//		cntryTo.sendKeys("Brazil");
//		cntryTo.sendKeys(Keys.ENTER);
//	
//		System.out.println("Done");
//	
//		WebElement srch =driver.findElement(By.xpath("//*[@id=\"visa-submit\"]/div/div[4]/button"));
//	    srch.click();
//	
// 
//	}
//}